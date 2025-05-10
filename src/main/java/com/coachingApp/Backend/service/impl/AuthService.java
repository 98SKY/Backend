package com.coachingApp.Backend.service.impl;

import com.coachingApp.Backend.dto.common.LoginRequest;
import com.coachingApp.Backend.dto.common.LoginResponse;
import com.coachingApp.Backend.exception.UnauthorizedException;
import com.coachingApp.Backend.model.Institute;
import com.coachingApp.Backend.model.User;
import com.coachingApp.Backend.repository.InstituteRepository;
import com.coachingApp.Backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

@Service
public class AuthService {

    private final InstituteRepository instituteRepository;
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;
    private final String jwtSecret;  // JWT secret key

    public AuthService(InstituteRepository instituteRepository,
                       UserRepository userRepository,
                       BCryptPasswordEncoder passwordEncoder,
                       @Value("${jwt.secret}") String jwtSecret) {
        this.instituteRepository = instituteRepository;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtSecret = jwtSecret;
    }

    public LoginResponse login(LoginRequest request) {
        String userType = request.getUserType();
        if ("institute".equalsIgnoreCase(userType)) {
            return loginInstitute(request);
        } else if ("student".equalsIgnoreCase(userType) || "teacher".equalsIgnoreCase(userType)) {
            return loginUser(request);
        } else {
            throw new IllegalArgumentException("Invalid userType: " + userType);
        }
    }

    private LoginResponse loginInstitute(LoginRequest request) {
        Institute institute = instituteRepository.findByUsername(request.getUsername())
                .orElseThrow(() -> new UnauthorizedException("Invalid institute credentials"));

        // Verify password using BCrypt
        if (!passwordEncoder.matches(request.getPassword(), institute.getPassword())) {
            throw new UnauthorizedException("Invalid institute credentials");
        }

        // Generate JWT token
        String token = generateToken(Long.valueOf(institute.getInstituteId()), "institute");

        return new LoginResponse(institute.getInstituteId(), "institute", "Login successful", token);
    }

    private LoginResponse loginUser(LoginRequest request) {
        if (request.getInstituteId() == null || request.getInstituteId().isBlank()) {
            throw new IllegalArgumentException("Institute ID is required for students/teachers");
        }

        User user = userRepository.findByUsernameAndInstitute_InstituteId(request.getUsername(), request.getInstituteId())
                .orElseThrow(() -> new UnauthorizedException("Invalid user credentials"));

        // Verify password using BCrypt
        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            throw new UnauthorizedException("Invalid user credentials");
        }

        // Generate JWT token
        String token = generateToken(Long.valueOf(user.getUserId()), request.getUserType());

        return new LoginResponse(user.getUserId(), request.getUserType(), "Login successful", token);
    }

    private String generateToken(Long userId, String userType) {
        // Set token expiration time (e.g., 1 hour)
        Date expirationDate = new Date(System.currentTimeMillis() + 3600000);

        // Generate the token
        return Jwts.builder()
                .setSubject(String.valueOf(userId))
                .claim("role", userType)
                .setIssuedAt(new Date())
                .setExpiration(expirationDate)
                .signWith(SignatureAlgorithm.HS256, jwtSecret)
                .compact();
    }
}
