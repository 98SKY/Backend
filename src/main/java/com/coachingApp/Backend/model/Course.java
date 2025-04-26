package com.coachingApp.Backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "courses")
@Getter
@Setter
@NoArgsConstructor
public class Course {

    private Long id;

    @Id
    private String courseId;
    private String courseStatus;
    private LocalDate enteredDate;
    private double experience;

    @ManyToOne
    @JoinColumn(name = "institute_id_c", referencedColumnName = "institute_id")
    private Institute institute;

    @ManyToOne
    @JoinColumn(name = "master_course_id_c", referencedColumnName = "masterCourseId")
    private CourseMaster courseMaster;

    @ManyToOne
    @JoinColumn(name = "user_id_c", referencedColumnName = "user_id")
    private User user;
}
