package com.coachingApp.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Time;
import java.time.LocalDate;

@Entity
@Table(name="examination")
public class Examination {

    @Id
    private String courseid;
    private String cycleid;
    private int testno;
    private LocalDate testdate;
    private Time testtime;
    private String agenda;
    private LocalDate entereddate;


}
