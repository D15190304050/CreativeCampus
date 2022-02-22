package com.creativecampus.teachers.services;

import com.creativecampus.commons.LogicOnly;
import com.creativecampus.commons.ServiceResponse;
import com.creativecampus.commons.domain.Teacher;
import com.creativecampus.mappers.TeacherMapper;
import com.creativecampus.teachers.api.ITeacherPermission;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@LogicOnly
@Service
@Slf4j
public class TeacherPermission implements ITeacherPermission
{
    @Autowired
    private ValueOperations<String, Object> valueOperations;

    @Autowired
    private Subject subject;

    @Autowired
    private TeacherMapper teacherMapper;

    public ServiceResponse<Boolean> logout()
    {
        subject.logout();

        return ServiceResponse.buildSuccessResponse(true);
    }

    @Transactional(rollbackFor = Exception.class)
    public ServiceResponse<Boolean> login(Teacher teacher)
    {

        return null;
    }
}
