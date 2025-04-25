package com.coachingApp.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "fees")
public class Fees {

    @Id
    private String fee_id;

    private float amount;
    private String description;
    private String institute_id_c;
    private String user_id_c;
    private String duration;
    private LocalDate entered_date;

}
