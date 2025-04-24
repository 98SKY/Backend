package com.coachingApp.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "coursespercycle")
public class CoursesPerCycle {

    @Id
    private String coursespercycle;

    private String cycleid;
    private LocalDate startdate;
    private LocalDate enddate;
    private LocalDate entereddate;

}
