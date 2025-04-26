package com.coachingApp.Backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor

public class User {

    private String username;
    private String email;
    private String phone_no;
    private String password;

    @ManyToOne
    @JoinColumn(name = "institute_id_c", referencedColumnName = "institute_id")
    private Institute institute;


    private String user_status;
    private String token;

    @Id
    private String user_id;
    private String role_type;
    private Long authenticate;
    private LocalDate entered_date;

    // One User can have multiple students, hence a list of students
    @OneToMany(mappedBy = "user")
    private List<Student> students;

    // Method to check if the User is a Student
    public boolean isStudent() {
        return "student".equalsIgnoreCase(role_type);
    }

    // Method to check if the User is a Teacher
    public boolean isTeacher() {
        return "teacher".equalsIgnoreCase(role_type);
    }


}
