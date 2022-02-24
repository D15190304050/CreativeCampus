package com.creativecampus.teachers.api;

import com.creativecampus.commons.ServiceResponse;
import com.creativecampus.commons.domain.Teacher;

import javax.servlet.http.HttpSession;

public interface ITeacherService
{
    ServiceResponse<Boolean> registerTeacher(Teacher teacher);

    ServiceResponse<Teacher> login(Teacher teacher, HttpSession session);

    ServiceResponse<Boolean> logout(HttpSession session);
}
