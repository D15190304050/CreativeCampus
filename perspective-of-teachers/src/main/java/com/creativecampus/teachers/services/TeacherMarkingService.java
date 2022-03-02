package com.creativecampus.teachers.services;

import com.creativecampus.commons.LogicOnly;
import com.creativecampus.commons.ServiceResponse;
import com.creativecampus.teachers.api.ITeacherMarkingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TeacherMarkingService implements ITeacherMarkingService
{
    @LogicOnly
    public ServiceResponse<Boolean> submitMarkingResultForStudent()
    {
        return null;
    }
}
