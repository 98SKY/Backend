package com.coachingApp.Backend.service.impl;

import com.coachingApp.Backend.model.Institute;
import com.coachingApp.Backend.repository.InstituteRepository;
import com.coachingApp.Backend.service.InstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstituteServiceImpl implements InstituteService {

    @Autowired
    private InstituteRepository instituteRepository;

    @Override
    public Institute saveInstitute(Institute institute){
        return instituteRepository.save(institute);
    }

    @Override
    public List<Institute> getAllInstitute(){
        return instituteRepository.findAll();
    }

    @Override
    public Institute getInstituteById(String instituteId){
        Optional<Institute> optionalInstitute = instituteRepository.findById(instituteId);
        return optionalInstitute.orElse(null);
    }

    @Override
    public Institute updateInstitute(Institute institute){
        return instituteRepository.save(institute);
    }

    @Override
    public boolean existInstitute(String instituteId){
        return instituteRepository.existsById(instituteId);
    }

    @Override
    public List<Institute> findInstituteByStatus(String status){
        return instituteRepository.findByInstituteStatus(status);
    }


}
