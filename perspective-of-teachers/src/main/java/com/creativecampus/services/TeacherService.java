package com.creativecampus.services;

import com.creativecampus.api.ITeacherService;
import com.creativecampus.commons.CommonErrorResponses;
import com.creativecampus.commons.LogicOnly;
import com.creativecampus.commons.ServiceResponse;
import com.creativecampus.commons.domain.Teacher;
import com.creativecampus.mappers.TeacherMapper;
import lombok.extern.slf4j.Slf4j;
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

    public ServiceResponse<Boolean> login(String account, String encryptedPassword)
    {
        int matchCount = teacherMapper.getCountByAccountAndEncryptedPassword(account, encryptedPassword);
        if (matchCount == 1)
            return ServiceResponse.buildSuccessResponse(true);
        else
            return ServiceResponse.buildErrorResponse(CommonErrorResponses.ACCOUNT_PASSWORD_NOT_MATCH);
    }


}
