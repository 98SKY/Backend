package com.coachingApp.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "testscores")
public class Testscores {

    @Id
    private String courseid;
    private String cycleid;
    private String studentid;
    private int testno;
    private double score;

}
