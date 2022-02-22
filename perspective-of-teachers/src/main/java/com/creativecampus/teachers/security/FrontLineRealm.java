package com.creativecampus.teachers.security;

import com.creativecampus.commons.domain.Teacher;
import com.creativecampus.mappers.TeacherMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ValueOperations;

@Slf4j
public class FrontLineRealm extends AuthorizingRealm
{
    private final static String HASH_ALGORITHM_NAME = "md5";
    private final int HASH_ITERATIONS = 1024;

    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private ValueOperations<String, Object> valueOperations;

    public FrontLineRealm()
    {
        HashedCredentialsMatcher matcher = new HashedCredentialsMatcher();
        matcher.setHashAlgorithmName(HASH_ALGORITHM_NAME);
        matcher.setHashIterations(HASH_ITERATIONS);
        this.setCredentialsMatcher(matcher);
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection)
    {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException
    {
        log.info("Try login for account: " + token.getPrincipal());

        String account = (String) token.getPrincipal();
        Teacher teacher = teacherMapper.getTeacherByAccount(account);

        if (teacher != null)
        {
            log.info("Try to test if password matches...");
            return new SimpleAuthenticationInfo(
                    account,
                    teacher.getHashedPassword(),
                    ByteSource.Util.bytes(teacher.getSalt()),
                    this.getName());
        }

        log.error("No such account...");
        return null;
    }
}
