package com.coachingApp.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Time;
import java.time.LocalDate;

@Entity
@Table(name = "test")
public class Attendance {

    @Id
    private String courseid;
    private String cycleid;
    private int classno;
    private String studentid;
    private Time timearrive;
    private Time timeleave;
    private LocalDate entereddate;

}
