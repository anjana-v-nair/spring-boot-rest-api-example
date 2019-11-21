package com.springboot.referenceapp.springbootrestapiexample.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.Calendar;

//@Entity
//@Table(name = "employee")
//@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
/*
public class Employee {

    @Column
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;

    @Column
    private String name;

    @Column
    private Date doj;

    @ManyToOne
    @JoinColumn(name = "department")
    private Department department;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
    private Calendar createdAt;
}
*/
