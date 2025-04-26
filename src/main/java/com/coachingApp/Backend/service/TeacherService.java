package com.coachingApp.Backend.service;

import com.coachingApp.Backend.model.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeacher();

    Teacher saveTeacher(Teacher teacher);

    Teacher getTeacherById(String teacherId);

    Teacher updateTeacher(Teacher teacher);

    Boolean existTeacher(String teacherId);
}
