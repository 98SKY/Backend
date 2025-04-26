package com.coachingApp.Backend.controller;

import com.coachingApp.Backend.dto.InstituteResponse;
import com.coachingApp.Backend.model.Institute;
import com.coachingApp.Backend.service.InstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/institutes")
public class InstituteController {

    @Autowired
    private InstituteService instituteService;

    @PostMapping
    public InstituteResponse createInstitute(@RequestBody Institute institute) {
        Institute savedInstitute = instituteService.saveInstitute(institute);
        return new InstituteResponse(savedInstitute.getUsername());
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
