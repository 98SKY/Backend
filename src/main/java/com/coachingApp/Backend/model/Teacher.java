package com.coachingApp.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "teachers")
public class Teacher {

    @Id
    private String teacherId;

    private String address;
    private String dob;
    private String enteredDate;
    private String gender;
    private String instituteIdC;
    private String name;
    private String usersIdC;
}
