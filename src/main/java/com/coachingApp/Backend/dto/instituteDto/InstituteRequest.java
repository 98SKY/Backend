package com.coachingApp.Backend.dto.instituteDto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class InstituteRequest {

    @NotBlank(message = "Institute name is required")
    private String instituteName;

    @NotBlank(message = "Phone number is required")
    private String phoneNo;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Address is required")
    private String address;
}
