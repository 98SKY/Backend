package com.coachingApp.Backend.service.impl;

import com.coachingApp.Backend.model.CourseMaster;
import com.coachingApp.Backend.repository.CourseMasterRepository;
import com.coachingApp.Backend.service.CourseMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseMasterServiceImpl implements CourseMasterService {

    @Autowired
    private CourseMasterRepository courseMasterRepository;

    @Override
    public CourseMaster saveCourseMaster(CourseMaster courseMaster){
        return courseMasterRepository.save(courseMaster);
    }

    @Override
    public CourseMaster getAllCourseByInstitute(String instituteId){
        Optional<CourseMaster> optionalCourseMaster = courseMasterRepository.findById(instituteId);
        return optionalCourseMaster.orElse(null);
    }

    public CourseMaster updateCourseMaster(CourseMaster courseMaster){
        return courseMasterRepository.save(courseMaster);
    }


}
