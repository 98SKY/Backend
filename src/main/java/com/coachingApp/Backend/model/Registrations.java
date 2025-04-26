package com.coachingApp.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "registrations")
public class Registrations {

    @Id
    private int id;
    private int user_id;
    private int course_id;
    private LocalDate registration_date;
    private int institute_id;

}
