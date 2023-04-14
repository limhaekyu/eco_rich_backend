package com.limhaekyu.eco_rich_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class IncreaseSalaryOfDepartmentDto {
    private Long departmentId;
    private BigDecimal increaseRate;
}
