package com.coachingApp.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "teacherspercourse")
public class TeacherserCourse {

    @Id
    private String courseid;
    private String cycleid;
    private String teacherid;
    private LocalDate entereddate;

}
