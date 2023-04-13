package com.limhaekyu.eco_rich_backend.service;

import com.limhaekyu.eco_rich_backend.dto.CurrentEmployeeInfoDto;
import com.limhaekyu.eco_rich_backend.dto.DepartmentAndLocationDto;
import com.limhaekyu.eco_rich_backend.dto.UpdateEmployeeInfoDto;

import java.math.BigDecimal;

public interface EmployeesService {

    CurrentEmployeeInfoDto findCurrentInfo(Long employeeId);

    DepartmentAndLocationDto findDepartmentAndLocation(Long employeeId);

    void updateInfo(Long employeeId, UpdateEmployeeInfoDto updateEmployeeInfo);

    void increaseSalaryOfDepartment(Long departmentId, BigDecimal increaseRate);
}
