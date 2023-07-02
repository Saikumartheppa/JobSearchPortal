package com.saikumar.JobSearchPortal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Job {
      @Id
      private Long id;
      @NotBlank(message = "job title should not be blank !!")
      private String title;
      @NotNull(message = "description should not be null !!")
      private String description;
      @NotBlank(message = "location should not be blank !!")
      private String location;
      @Min(value = 20000,message = "salary should be greater than 20000 !!")
      private Double salary;
      @Email(message = "provide a valid email")
      private String companyEmail;
      @Pattern(regexp = "^[A-Z][a-zA-Z]*$",message = "first letter of company name should be in upper case")
      private String companyName;
      @Enumerated(EnumType.STRING)
      private Type jobType;
      @Future(message = "apply date should in future")
      private LocalDate applyDate;
}
