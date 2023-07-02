package com.saikumar.JobSearchPortal.service;

import com.saikumar.JobSearchPortal.model.Job;
import com.saikumar.JobSearchPortal.model.Type;
import com.saikumar.JobSearchPortal.repository.IJobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {
   @Autowired
    IJobRepo jobRepo;

    public String addJob(Job job) {
        jobRepo.save(job);
        return "Job added successfully";
    }

    public String addJobs(List<Job> jobs) {
        jobRepo.saveAll(jobs);
        return "Jobs added successfully";
    }

    public Object getAllJobs() {
      return  jobRepo.findAll();
    }

    public Job getJobById(Long jId) {
       return jobRepo.findJobById(jId);
    }

    public List<Job> getAllJobsByTypeAndSalary(Type type, Double salary) {
        return jobRepo.findByJobTypeAndSalaryGreaterThan(type,salary);
    }

    public List<Job> getAllJobsByTypeAndLocation(Type type1, String location,Type type2) {
        return jobRepo.findByJobTypeAndLocationOrJobType(type1,location,type2);
    }

    public String updateSalaryById(Long jId,Double salary) {
      if(jobRepo.existsById(jId)){
          jobRepo.findJobById(jId).setSalary(salary);
          jobRepo.save( jobRepo.findJobById(jId));
          return "job"+" : "+jId+" "+"salary updated !!";
      }
      return "job"+" : "+jId+" "+"not found !!";
    }

    public String deleteJobById(long jId) {
        if(jobRepo.existsById(jId)) {
            jobRepo.deleteById(jId);
            return "deleted successfully";
        }
        return "no such job exits !!";
    }
}
