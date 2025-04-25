package com.coachingApp.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "testscores")
public class Testscores {

    private String courseid;
    private String cycleid;
    private String studentid;
    private int testno;
    private double score;

}
