package com.coachingApp.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    @Id
    private String StudentId;

    private String address;
    private String enteredDate;
    private String gender;
    private String instituteIdC;
    private String medium;
    private String name;
    private String std;
    private String usersIdC;
}
