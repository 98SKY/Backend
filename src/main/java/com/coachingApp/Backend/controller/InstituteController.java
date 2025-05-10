package com.coachingApp.Backend.controller;

import com.coachingApp.Backend.dto.instituteDto.InstituteRequest;
import com.coachingApp.Backend.dto.instituteDto.InstituteResponse;
import com.coachingApp.Backend.model.Institute;
import com.coachingApp.Backend.response.ApiResponse;
import com.coachingApp.Backend.service.InstituteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

import java.util.List;

@RestController
@RequestMapping("/api/register")
public class InstituteController {

    @Autowired
    private InstituteService instituteService;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;


    @PostMapping
    public ResponseEntity<ApiResponse<InstituteResponse>> createInstitute(@Valid @RequestBody InstituteRequest instituteRequest) {

        String rawPassword = generateRandomPassword(); // generate password
        String encodedPassword = passwordEncoder.encode(rawPassword);

        Institute institute = new Institute();
        institute.setInstituteName(instituteRequest.getInstituteName());
        institute.setPhoneNo(instituteRequest.getPhoneNo());
        institute.setEmail(instituteRequest.getEmail());
        institute.setAddress(instituteRequest.getAddress());
        institute.setPassword(encodedPassword);

        Institute savedInstitute = instituteService.saveInstitute(institute);

        InstituteResponse instituteResponse = new InstituteResponse(savedInstitute.getUsername());

        ApiResponse<InstituteResponse> response = new ApiResponse<>(
                "Institute created successfully",
                201,
                instituteResponse
        );

        return ResponseEntity.status(201).body(response);

    }


    @GetMapping
    public List<Institute> getAllInstitutes(){
        return instituteService.findInstituteByStatus("Active");
    }

    @GetMapping("/{Id}")
    public Institute getInstituteById(@PathVariable  String Id){
        return instituteService.getInstituteById(Id);
    }

    private String generateRandomPassword() {
        // Example: 8-char alphanumeric password
        return UUID.randomUUID().toString().substring(0, 8);
    }
}
