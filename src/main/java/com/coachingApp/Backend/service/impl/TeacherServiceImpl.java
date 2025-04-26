package com.coachingApp.Backend.service.impl;

import com.coachingApp.Backend.model.Teacher;
import com.coachingApp.Backend.repository.TeacherRepository;
import com.coachingApp.Backend.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public List<Teacher> getAllTeacher(){
        return teacherRepository.findAll();
    }

    @Override
    public Teacher saveTeacher(Teacher teacher){
        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher getTeacherById(String teacherId){
        Optional<Teacher> optionalTeacher = teacherRepository.findById(teacherId);
        return optionalTeacher.orElse(null);
    }

    @Override
    public Teacher updateTeacher(Teacher teacher){
        return teacherRepository.save(teacher);
    }

    @Override
    public Boolean existTeacher(String teacherId){
        return teacherRepository.existsById(teacherId);
    }
}
