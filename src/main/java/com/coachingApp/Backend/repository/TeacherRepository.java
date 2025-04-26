package com.coachingApp.Backend.repository;

import com.coachingApp.Backend.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, String> {
}
