package com.coachingApp.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serial;
import java.time.LocalDate;

@Entity
@Table(name = "classes")
public class Classes {

    @Id
    private Long id;

    private int course_id;
    private LocalDate start_date;
    private LocalDate end_date;
    private String instructor;
    private int institute_id;


}
