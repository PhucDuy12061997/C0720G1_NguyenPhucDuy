package com.example.case_study_furama_spring.repository.employee;

import com.example.case_study_furama_spring.entity.employee.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationDegreeRepository extends JpaRepository<EducationDegree, Integer> {
}
