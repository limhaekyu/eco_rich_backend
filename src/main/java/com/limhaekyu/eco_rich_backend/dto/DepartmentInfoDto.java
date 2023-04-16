package com.limhaekyu.eco_rich_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class DepartmentInfoDto {
    // departments
    private Long departmentId;
    private String departmentName;
    // locations
    private Long locationId;
    private String streetAddress;
    private String postalCode;
    private String city;
    private String stateProvince;
    // countries
    private char countryId;
    private String countryName;
    // regions
    private String regionName;
}

