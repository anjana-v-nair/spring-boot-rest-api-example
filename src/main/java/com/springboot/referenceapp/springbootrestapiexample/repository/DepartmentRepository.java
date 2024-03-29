package com.springboot.referenceapp.springbootrestapiexample.repository;

import com.springboot.referenceapp.springbootrestapiexample.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {
}
