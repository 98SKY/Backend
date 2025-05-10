package com.coachingApp.Backend.repository;

import com.coachingApp.Backend.model.Institute;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InstituteRepository  extends JpaRepository<Institute, String> {

    List<Institute> findByInstituteStatus(String instituteStatus);
    boolean existsByEmail(String email);
    Optional<Institute> findByUsername(String username);
}
