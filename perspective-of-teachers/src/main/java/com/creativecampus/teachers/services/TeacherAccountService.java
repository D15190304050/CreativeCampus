package com.creativecampus.teachers.services;

import com.creativecampus.commons.CommonErrorResponses;
import com.creativecampus.commons.LogicOnly;
import com.creativecampus.commons.ServiceResponse;
import com.creativecampus.commons.constants.RedisKeys;
import com.creativecampus.commons.domain.Teacher;
import com.creativecampus.mappers.TeacherMapper;
import com.creativecampus.teachers.api.ITeacherAccountService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.time.Duration;

@Service
@Slf4j
public class TeacherAccountService implements ITeacherAccountService
{
    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private Subject subject;

    @Autowired
    private ValueOperations<String, Object> valueOperations;

    private boolean exists(String account)
    {
        return teacherMapper.getCountByAccount(account) > 0;
    }

    @Override
    @Transactional
    public ServiceResponse<Boolean> registerTeacher(Teacher teacher)
    {
        // Check if the account exists.
        if (exists(teacher.getAccount()))
            return ServiceResponse.buildErrorResponse(CommonErrorResponses.ACCOUNT_EXISTS);

        int insertionCount = teacherMapper.insertTeacher(teacher);

        return ServiceResponse.buildSuccessResponse(insertionCount == 1);
    }

    @Override
    @Transactional
    @LogicOnly
    public ServiceResponse<Teacher> login(Teacher teacher, HttpSession session)
    {
        try
        {
            subject.login(new UsernamePasswordToken(teacher.getAccount(), teacher.getHashedPassword()));
        }
        catch (UnknownAccountException e)
        {
            return ServiceResponse.buildErrorResponse(CommonErrorResponses.NO_SUCH_TEACHER);
        }
        catch (IncorrectCredentialsException e)
        {
            return ServiceResponse.buildErrorResponse(CommonErrorResponses.ACCOUNT_PASSWORD_NOT_MATCH);
        }

        Teacher result = teacherMapper.getTeacherByAccount(teacher.getAccount());

        // If the program reaches here, then login success.
        // Save login state.
        // Keep-alive duration = 30 min.
        valueOperations.set(RedisKeys.getSessionIdKey(session.getId()), teacher.getId(), Duration.ofMinutes(30));

        return ServiceResponse.buildSuccessResponse(result);
    }

    public ServiceResponse<Boolean> logout(HttpSession session)
    {
        String sessionIdKey = RedisKeys.getSessionIdKey(session.getId());
        Boolean deleteResult = valueOperations.getOperations().delete(sessionIdKey);
        return ServiceResponse.buildSuccessResponse(deleteResult);
    }
}
