package com.creativecampus.api;

import com.creativecampus.commons.ServiceResponse;
import com.creativecampus.commons.domain.Teacher;

public interface ITeacherService
{
    ServiceResponse<Boolean> registerTeacher(Teacher teacher);
}
