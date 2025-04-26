package com.coachingApp.Backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "institutes")
@Getter
@Setter
@NoArgsConstructor

public class Institute {

    private String address;
    private int authenticate;
    private String email;

    @Column(name = "entered_date")
    private LocalDate enteredDate;

    @Id
    @Column(name = "institute_id")
    private String instituteId;

    @Column(name = "institute_name")
    private String instituteName;

    @Column(name = "institute_status")
    private String instituteStatus;

    private String password;

    @Column(name="phone_no")
    private String phoneNo;

    private String token;
    private String username;

    @OneToMany(mappedBy = "institute")
    private List<Student> students;

    @OneToMany(mappedBy = "institute")
    private List<CourseMaster> courseMasterList;

}
