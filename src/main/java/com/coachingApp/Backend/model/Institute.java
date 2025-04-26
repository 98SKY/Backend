package com.coachingApp.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "institutes")
public class Institute {

    @Id
    private String id;

    private String address;
    private int authenticate;
    private String email;
    private LocalDate enteredDate;
    private String instituteId;
    private String instituteName;
    private String instituteStatus;
    private String password;
    private String phoneNo;
    private String token;
    private String username;
}
