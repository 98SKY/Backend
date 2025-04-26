package com.coachingApp.Backend.repository;

import com.coachingApp.Backend.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, String> {
}
