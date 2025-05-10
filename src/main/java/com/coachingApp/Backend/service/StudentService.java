package com.coachingApp.Backend.service;

import com.coachingApp.Backend.model.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);

    List<Student> getAllStudent();

    Student getStudentById(String studentId);

    Student updateStudent(Student student);
}
