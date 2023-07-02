package com.saikumar.JobSearchPortal.repository;

import com.saikumar.JobSearchPortal.model.Job;
import com.saikumar.JobSearchPortal.model.Type;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobRepo extends CrudRepository<Job,Long> {

    Job findJobById(Long jId);

    List<Job> findByJobTypeAndSalaryGreaterThan(Type type, Double salary);

    List<Job> findByJobTypeAndLocationOrJobType(Type type1, String location, Type type2);

}
