package com.coachingApp.Backend.repository;

import com.coachingApp.Backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
