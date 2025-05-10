package com.coachingApp.Backend.service.impl;

import com.coachingApp.Backend.model.Institute;
import com.coachingApp.Backend.repository.InstituteRepository;
import com.coachingApp.Backend.service.InstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class InstituteServiceImpl implements InstituteService {

    @Autowired
    private InstituteRepository instituteRepository;

    @Override
    public Institute saveInstitute(Institute institute) {

        if (instituteRepository.existsByEmail(institute.getEmail())) {
            throw new RuntimeException("Email is already in use. Please use a different email.");
        }

        String instituteName = institute.getInstituteName();
        String phoneNo = institute.getPhoneNo();

        institute.setInstituteId(UUID.randomUUID().toString());
        institute.setInstituteStatus("Active");
        institute.setEnteredDate(LocalDateTime.now());

        if (instituteName != null && instituteName.length() >= 3 && phoneNo != null && phoneNo.length() >= 2) {
            String cleanedInstituteName = instituteName.replaceAll("\\s+", ""); // remove all spaces
            String generatedUsername = cleanedInstituteName.substring(0, 3).toLowerCase() + phoneNo.substring(phoneNo.length() - 2);
            institute.setUsername(generatedUsername);
        } else {
            institute.setUsername("NewUser");
        }
        return instituteRepository.save(institute);
    }

    @Override
    public List<Institute> getAllInstitute() {
        return instituteRepository.findAll();
    }

    @Override
    public Institute getInstituteById(String instituteId) {
        Optional<Institute> optionalInstitute = instituteRepository.findById(instituteId);
        return optionalInstitute.orElse(null);
    }

    @Override
    public Institute updateInstitute(Institute institute) {
        return instituteRepository.save(institute);
    }

    @Override
    public boolean existInstitute(String instituteId) {
        return instituteRepository.existsById(instituteId);
    }

    @Override
    public List<Institute> findInstituteByStatus(String status) {
        return instituteRepository.findByInstituteStatus(status);
    }

}
