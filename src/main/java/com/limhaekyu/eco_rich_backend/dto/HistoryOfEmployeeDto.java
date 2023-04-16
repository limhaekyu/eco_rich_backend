package com.limhaekyu.eco_rich_backend.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class HistoryOfEmployeeDto {
    private Date startDate;
    private Date endDate;
    private String jobId;
    private String jobTitle;
    private DepartmentInfoDto departmentInfo;
}
