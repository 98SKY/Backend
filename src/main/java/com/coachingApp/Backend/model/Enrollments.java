package com.coachingApp.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "enrollments")
public class Enrollments {
    @Id
    private String enrollments;

    private String cycleid;
    private String studentid;
    private LocalDate enterdate;
    private Boolean cancelled;
    private String cancellationreason;

}
