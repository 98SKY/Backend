package com.coachingApp.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course_master")
public class CourseMaster {
    @Id
    private String masterCourseId;

    private String instituteIdC;
    private String masterCourseName;
    private String masterCourseStatus;
}
