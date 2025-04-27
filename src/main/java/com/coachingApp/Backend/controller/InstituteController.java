package com.coachingApp.Backend.controller;

import com.coachingApp.Backend.dto.instituteDto.InstituteRequest;
import com.coachingApp.Backend.dto.instituteDto.InstituteResponse;
import com.coachingApp.Backend.model.Institute;
import com.coachingApp.Backend.service.InstituteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/institutes")
public class InstituteController {

    @Autowired
    private InstituteService instituteService;

    @PostMapping
    public ResponseEntity<InstituteResponse> createInstitute(@Valid @RequestBody InstituteRequest instituteRequest) {
        Institute institute = new Institute();
        institute.setInstituteName(instituteRequest.getInstituteName());
        institute.setPhoneNo(instituteRequest.getPhoneNo());
        institute.setEmail(instituteRequest.getEmail());
        institute.setAddress(instituteRequest.getAddress());

        Institute savedInstitute = instituteService.saveInstitute(institute);
        return ResponseEntity.status(201).body(new InstituteResponse(savedInstitute.getUsername()));

    }


    @GetMapping
    public List<Institute> getAllInstitutes(){
        return instituteService.findInstituteByStatus("Active");
    }

    @GetMapping("/{Id}")
    public Institute getInstituteById(@PathVariable  String Id){
        return instituteService.getInstituteById(Id);
    }
}
