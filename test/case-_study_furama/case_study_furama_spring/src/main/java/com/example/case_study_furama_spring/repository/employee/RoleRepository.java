package com.example.case_study_furama_spring.repository.employee;


import com.example.case_study_furama_spring.entity.employee.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
