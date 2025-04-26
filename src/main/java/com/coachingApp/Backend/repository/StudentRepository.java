package com.coachingApp.Backend.repository;

import com.coachingApp.Backend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {
}
