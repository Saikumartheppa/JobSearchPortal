package com.saikumar.JobSearchPortal.controller;

import com.saikumar.JobSearchPortal.model.Job;
import com.saikumar.JobSearchPortal.model.Type;
import com.saikumar.JobSearchPortal.repository.IJobRepo;
import com.saikumar.JobSearchPortal.service.JobService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class JobController {
    @Autowired
    JobService jobService;

    // adding a new job
    @PostMapping("job")
    public String addJob(@Valid  @RequestBody Job job){
        return jobService.addJob(job);
    }
    //adding multiple jobs at a time
    @PostMapping("jobs")
    public String addJobs(@RequestBody List<Job> jobs){
        return jobService.addJobs(jobs);
    }
    // fetching all jobs present in DB
    @GetMapping("jobs")
    public List<Job> getAllJobs(){
        return (List<Job>) jobService.getAllJobs();
    }
    // fetching a particular job using custom finder
    @GetMapping("jobs/job/{jId}")
    public Job getJobById(@PathVariable Long jId){
        return jobService.getJobById(jId);
    }
    // fetching a job in a particular jobType and with specific salary
    @GetMapping("jobs/job/jobType/{type}/salary/{salary}")
    public List<Job> getAllJobsByTypeAndSalary(@PathVariable Type type,@PathVariable Double salary){
        return jobService.getAllJobsByTypeAndSalary(type,salary);
    }
    // fetching a job in particular type and in specific location
    @GetMapping("jobs/job/jobType/{type1}/location/{location}/jobType/{type2}")
    public List<Job> getAllJobsByTypeAndLocation(@PathVariable Type type1,@PathVariable String location,@PathVariable Type type2){
      return jobService.getAllJobsByTypeAndLocation(type1,location,type2);
    }
    // updating salary by Id
    @PutMapping("jobs/job/{jId}/salary/{salary}")
    public String updateSalaryById(@PathVariable Long jId,@PathVariable Double salary){
        return jobService.updateSalaryById(jId,salary);
    }
    // deleting a job using Id
    @DeleteMapping("jobs/job/{jId}")
    public String deleteJobById(@PathVariable long jId){
      return  jobService.deleteJobById(jId);
    }
}
