package com.coachingApp.Backend.service;

import com.coachingApp.Backend.model.CourseMaster;

public interface CourseMasterService {
    CourseMaster saveCourseMaster(CourseMaster courseMaster);

    CourseMaster getAllCourseByInstitute(String instituteId);
}
