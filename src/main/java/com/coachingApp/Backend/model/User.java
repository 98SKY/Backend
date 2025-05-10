package com.coachingApp.Backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @Column(name = "user_id")
    private String userId;

    private String username;
    private String email;

    @Column(name = "phone_no")
    private String phoneNo;

    private String password;

    @ManyToOne
    @JoinColumn(name = "institute_id_c", referencedColumnName = "institute_id")
    private Institute institute;

    @Column(name = "user_status")
    private String userStatus;

    private String token;

    @Column(name = "role_type")
    private String roleType;

    private Long authenticate;

    @Column(name = "entered_date")
    private LocalDate enteredDate;

    @OneToMany(mappedBy = "user")
    private List<Student> students;

    // Method to check if the User is a Student
    public boolean isStudent() {
        return "student".equalsIgnoreCase(roleType);
    }

    // Method to check if the User is a Teacher
    public boolean isTeacher() {
        return "teacher".equalsIgnoreCase(roleType);
    }
}
