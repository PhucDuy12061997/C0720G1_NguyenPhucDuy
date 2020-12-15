package com.example.case_study_furama_spring.repository.employee;


import com.example.case_study_furama_spring.entity.employee.AppUser;
import com.example.case_study_furama_spring.entity.employee.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    List<UserRole> findByAppUser(AppUser appUser);
}
