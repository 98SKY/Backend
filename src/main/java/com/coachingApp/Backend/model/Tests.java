package com.coachingApp.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Time;
import java.time.LocalDate;

@Entity
@Table(name="tests")
public class Tests {

    private String courseid;
    private String cycleid;
    private int testno;
    private LocalDate testdate;
    private Time testtime;
    private String agenda;
    private LocalDate entereddate;


}
