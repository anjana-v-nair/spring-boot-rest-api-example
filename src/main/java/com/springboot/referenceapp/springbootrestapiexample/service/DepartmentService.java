package com.springboot.referenceapp.springbootrestapiexample.service;

import com.springboot.referenceapp.springbootrestapiexample.domain.Department;
import com.springboot.referenceapp.springbootrestapiexample.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAllDepartments(){
        return departmentRepository.findAll();
    }
}
