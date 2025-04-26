package com.coachingApp.Backend.service;

import com.coachingApp.Backend.model.Institute;

import java.util.List;

public interface InstituteService {

    Institute saveInstitute(Institute institute);

    List<Institute> getAllInstitute();

    Institute getInstituteById(String instituteId);

    Institute updateInstitute(Institute institute);

    boolean existInstitute(String instituteId);

    List<Institute> findInstituteByStatus(String status);
}
