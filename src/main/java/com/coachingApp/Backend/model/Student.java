package com.coachingApp.Backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "students")

@Setter
@Getter
@NoArgsConstructor
public class Student {

    @Id
    @Column(name = "student_id")
    private String studentId;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "entered_date")
    private LocalDate enteredDate;

    @Column(name = "users_id_c")
    private String usersIdC;

    @Column(name = "medium")
    private String medium;

    @Column(name = "address")
    private String address;

    @Column(name = "std")
    private String std;

    @ManyToOne
    @JoinColumn(name = "institute_id_c", referencedColumnName = "institute_id")
    private Institute institute;
}
