package com.coachingApp.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "cycles")
public class Cycle {

    @Id
    private String cycleid;

    private String cycledesc;
    private LocalDate entereddate;
    private LocalDate datemodified;
    private LocalDate vactionstartdate;
    private LocalDate vactionenddate;
}
