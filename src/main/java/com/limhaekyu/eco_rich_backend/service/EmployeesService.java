package com.limhaekyu.eco_rich_backend.service;

import com.limhaekyu.eco_rich_backend.dto.CurrentEmployeeInfoDto;
import com.limhaekyu.eco_rich_backend.dto.DepartmentAndLocationDto;
import com.limhaekyu.eco_rich_backend.dto.UpdateEmployeeInfoDto;

import java.math.BigDecimal;

public interface EmployeesService {

    CurrentEmployeeInfoDto findCurrentInfo(int employeeId);

    DepartmentAndLocationDto findDepartmentAndLocation(int employeeId);

    void updateInfo(int employeeId, UpdateEmployeeInfoDto updateEmployeeInfo);

    void increaseSalaryOfDepartment(int departmentId, BigDecimal increaseRate);
}
