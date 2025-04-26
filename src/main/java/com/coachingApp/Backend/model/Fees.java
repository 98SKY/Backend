package com.coachingApp.Backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "fees")
@Setter
@Getter
@NoArgsConstructor
public class Fees {

    @Id
    private String fee_id;

    private float amount;
    private String description;
    private String duration;
    private LocalDate entered_date;

    @ManyToOne
    @JoinColumn(name = "institute_id_c", referencedColumnName = "institute_id")
    private Institute institute;

    @ManyToOne
    @JoinColumn(name = "user_id_c", referencedColumnName = "user_id")
    private User user;

}
