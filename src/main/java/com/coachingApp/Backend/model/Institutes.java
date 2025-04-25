package com.coachingApp.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serial;
import java.time.LocalDate;

@Entity
@Table(name = "institutes")
public class Institutes {

    @Id
    private Serial id;

    private String username;
    private String email;
    private String phone_no;
    private String password;
    private String institute_name;
    private String institute_id;
    private String institute_status;
    private String token;
    private String address;
    private int authenticate;
    private LocalDate entered_date;


}
