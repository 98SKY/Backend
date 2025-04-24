package com.coachingApp.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "categories")
public class Categories {

    @Id
    private String categorieid;
    private String categoriedesc;
    private LocalDate dateentered;
    private LocalDate datemodified;
    private LocalDate enddate;
}
