package com.limhaekyu.eco_rich_backend.service.impl;

import com.limhaekyu.eco_rich_backend.domain.EmpDetailsView;
import com.limhaekyu.eco_rich_backend.domain.Employees;
import com.limhaekyu.eco_rich_backend.dto.CurrentEmployeeInfoDto;
import com.limhaekyu.eco_rich_backend.dto.DepartmentAndLocationDto;
import com.limhaekyu.eco_rich_backend.dto.UpdateEmployeeInfoDto;
import com.limhaekyu.eco_rich_backend.mapper.EmpDetailsViewMapper;
import com.limhaekyu.eco_rich_backend.repository.EmpDetailsViewRepository;
import com.limhaekyu.eco_rich_backend.repository.EmployeesRepository;
import com.limhaekyu.eco_rich_backend.service.EmployeesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class EmployeesServiceImpl implements EmployeesService {

    private final EmpDetailsViewRepository empDetailsViewRepository;
    private final EmployeesRepository employeesRepository;

    @Override
    @Transactional(readOnly = true)
    public CurrentEmployeeInfoDto findCurrentInfo(Long employeeId) {
        EmpDetailsView empDetailsView = findEmployeeInfo(employeeId);
        return EmpDetailsViewMapper.INSTANCE.entityToDto(empDetailsView);
    }

    @Override
    public DepartmentAndLocationDto findDepartmentAndLocation(Long employeeId) {
        return null;
    }

    /*
        firstName, lastName, email, phoneNumber, salary, commissionPct, departmentId
     */
    @Override
    @Transactional
    public void updateInfo(Long employeeId, UpdateEmployeeInfoDto updateEmployeeInfo) {
        try {
            Employees employee = findEmploy(employeeId);
            employee.updateInfo(updateEmployeeInfo);
            employeesRepository.save(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void increaseSalaryOfDepartment(Long departmentId, BigDecimal increaseRate) {

    }

    private Employees findEmploy(Long employeeId) {
        return employeesRepository.findById(employeeId).orElseThrow(() -> new NoSuchElementException("등록되지 않은 직원 ID 입니다."));
    }

    private EmpDetailsView findEmployeeInfo(Long employeeId) {
        return empDetailsViewRepository.findByEmployeeId(employeeId).orElseThrow(() -> new NoSuchElementException("등록되지 않은 직원 ID 입니다."));
    }
}
