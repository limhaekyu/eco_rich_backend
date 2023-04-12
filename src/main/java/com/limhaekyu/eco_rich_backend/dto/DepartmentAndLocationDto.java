package com.limhaekyu.eco_rich_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class DepartmentAndLocationDto {

    private int departmentId;
    private String departmentName;
    private int managerId;
    private LocationInfoDto locationInfo;
}
