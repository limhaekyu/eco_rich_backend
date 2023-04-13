package com.limhaekyu.eco_rich_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class CurrentEmployeeInfoDto {
    // employees
    private Long employeeId;
    private String jobId;
    private Long managerId;
    private Long departmentId;

    // departments
    private Long locationId;

    // locations
    private char countryId;

    // employees
    private String firstName;
    private String lastName;
    private BigDecimal salary;
    private BigDecimal commissionPct;

    // departments
    private String departmentName;

    // jobs
    private String jobTitle;

    // locations
    private String city;
    private String stateProvince;

    // countries
    private String countryName;

    // regions
    private String regionName;
}
