package com.coachingApp.Backend.repository;

import com.coachingApp.Backend.model.Fees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeeRepository extends JpaRepository<Fees, String> {
}
