package com.coachingApp.Backend.repository;

import com.coachingApp.Backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByUsernameAndInstitute_InstituteId(String username, String instituteId);

}
