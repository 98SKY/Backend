package com.coachingApp.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serial;
import java.time.LocalDate;

@Entity
@Table(name = "users")
public class User {

    @Id
    private Serial id;

    private String username;
    private String email;
    private String phone_no;
    private String password;
    private String institute_id_c;
    private String user_status;
    private String token;
    private String user_id;
    private String role_type;
    private int authenticate;
    private LocalDate entered_date;


}
