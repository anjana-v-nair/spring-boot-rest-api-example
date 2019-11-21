package com.springboot.referenceapp.springbootrestapiexample.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DepartmentApprovalModel {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("dept_name")
    private String deptName;

    @JsonProperty("status")
    private boolean status;
}
