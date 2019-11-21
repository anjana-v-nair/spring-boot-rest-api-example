package com.springboot.referenceapp.springbootrestapiexample.controller;


import com.springboot.referenceapp.springbootrestapiexample.domain.Department;
import com.springboot.referenceapp.springbootrestapiexample.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/department/v1/", method = RequestMethod.GET)
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }
}
