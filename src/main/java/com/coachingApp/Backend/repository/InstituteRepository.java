package com.coachingApp.Backend.repository;

import com.coachingApp.Backend.model.Institute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstituteRepository  extends JpaRepository<Institute, String> {
}
