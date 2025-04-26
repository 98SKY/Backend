package com.coachingApp.Backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "teachers")
@Setter
@Getter
@NoArgsConstructor
public class Teacher {

    @Id
    @Column(name = "teacher_id")
    private String teacherId;

    private String address;
    private String dob;

    @Column(name = "entered_date")
    private String enteredDate;
    private String gender;

    @ManyToOne
    @JoinColumn(name = "institute_id_c", referencedColumnName = "institute_id")
    private Institute institute;

    private String name;

    @ManyToOne
    @JoinColumn(name = "users_id_c", referencedColumnName = "user_id")
    private User user;
}
