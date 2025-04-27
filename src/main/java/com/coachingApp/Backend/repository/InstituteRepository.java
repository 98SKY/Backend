package com.coachingApp.Backend.repository;

import com.coachingApp.Backend.model.Institute;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InstituteRepository  extends JpaRepository<Institute, String> {

    List<Institute> findByInstituteStatus(String instituteStatus);
    boolean existsByEmail(String email);
}
