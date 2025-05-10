package com.coachingApp.Backend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "institutes")
@Getter
@Setter
@NoArgsConstructor

public class Institute {

    private String address;
    private int authenticate;

    @Email(message = "Please Enter a valid Email")
    @NotBlank(message = "Email is Required")
    @Column(unique = true)
    private String email;

    @Column(name = "entered_date")
    private LocalDateTime enteredDate;

    @Id
    @Column(name = "institute_id")
    private String instituteId;

    @Column(name = "institute_name")
    @NotBlank(message = "Institute Name is required")
    private String instituteName;

    @Column(name = "institute_status")
    private String instituteStatus;

    private String password;

    @Column(name = "phone_no")
    @NotBlank(message = "Phone no is required")
    private String phoneNo;

    private String token;
    private String username;

    @OneToMany(mappedBy = "institute")
    private List<Student> students;

    @OneToMany(mappedBy = "institute")
    private List<CourseMaster> courseMasterList;

}
