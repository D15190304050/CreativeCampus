package com.creativecampus.teachers.services;

import com.creativecampus.commons.CommonErrorResponses;
import com.creativecampus.commons.LogicOnly;
import com.creativecampus.commons.ServiceResponse;
import com.creativecampus.commons.domain.Teacher;
import com.creativecampus.mappers.TeacherMapper;
import com.creativecampus.teachers.api.ITeacherService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@LogicOnly
public class TeacherService implements ITeacherService
{
    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private Subject subject;

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
    public ServiceResponse<Teacher> login(Teacher teacher)
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
        return ServiceResponse.buildSuccessResponse(result);
    }

}
