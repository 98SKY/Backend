package com.coachingApp.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    private String id;

    private String courseId;
    private String courseStatus;
    private String enteredDate;
    private String experience;

    private String instituteIdC;
    private String masterCourseIdC;
    private String userIdC;
}
