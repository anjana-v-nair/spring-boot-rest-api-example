package com.springboot.referenceapp.springbootrestapiexample.service;

import com.springboot.referenceapp.springbootrestapiexample.domain.Department;
import com.springboot.referenceapp.springbootrestapiexample.repository.DepartmentRepository;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
class DepartmentServiceTest {

    @InjectMocks
    private DepartmentService departmentService;
    @Mock
    private DepartmentRepository departmentRepository;
    private Department department;
    private List<Department> departmentList;

    @BeforeEach
    public void setUp() {

        department = Department.builder().dept("Finance").city("Mum").build();
        departmentList.add(department);
    }

    @Test
    public void TestThatWhenFindAllIsGivenThenAllDepartmentIsReturned() {

        Mockito.when(departmentRepository.findAll()).thenReturn(departmentList);
        List<Department> response = departmentService.getAllDepartments();
        Assert.assertEquals(departmentList, response);


    }
}