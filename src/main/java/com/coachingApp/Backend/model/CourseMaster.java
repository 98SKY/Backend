package com.coachingApp.Backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "course_master")
@Setter
@Getter
@NoArgsConstructor
public class CourseMaster {

    @Id
    private String masterCourseId;

    @ManyToOne
    @JoinColumn(name = "institute_id_c", referencedColumnName = "institute_id")
    private Institute institute;

    private String masterCourseName;
    private String masterCourseStatus;
}
