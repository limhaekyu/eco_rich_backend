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

    private Long departmentId;
    private String departmentName;
    private Long managerId;
    private LocationInfoDto locationInfo;
}
