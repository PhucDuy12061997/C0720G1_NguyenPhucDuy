package com.example.case_study_furama_spring.repository.employee;


import com.example.case_study_furama_spring.entity.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Page<Employee> findByNameContaining(Pageable pageable, String name);

//    @Query(value = "select * from blog group by id order by date_created desc", nativeQuery = true)
//    List<Blog> findAllBlogAndSort();
//
//    @Query(value = "select * from blog limit  ?1, ?2", nativeQuery = true)
//    List<Blog> findAllScroll(int start, int limit);
}