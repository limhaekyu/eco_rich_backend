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
    private int employeeId;
    private String jobId;
    private int managerId;
    private int departmentId;
    private int locationId;
    private char countryId;
    private String firstName;
    private String lastName;
    private BigDecimal salary;
    private BigDecimal commissionPct;
    private String departmentName;
    private String jobTitle;
    private String city;
    private String stateProvince;
    private String countryName;
    private String regionName;
}
