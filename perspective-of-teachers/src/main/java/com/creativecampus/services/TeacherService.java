package com.creativecampus.services;

import com.creativecampus.api.ITeacherService;
import com.creativecampus.commons.ServiceResponse;
import com.creativecampus.commons.domain.Teacher;
import com.creativecampus.commons.runtime.LogAndValidate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@LogAndValidate
public class TeacherService implements ITeacherService
{
    @Override
    public ServiceResponse<Boolean> registerTeacher(Teacher teacher)
    {
        return ServiceResponse.buildSuccessResponse(true);
    }
}
