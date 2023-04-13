package com.limhaekyu.eco_rich_backend.service.impl;

import com.limhaekyu.eco_rich_backend.domain.EmpDetailsView;
import com.limhaekyu.eco_rich_backend.dto.CurrentEmployeeInfoDto;
import com.limhaekyu.eco_rich_backend.dto.DepartmentAndLocationDto;
import com.limhaekyu.eco_rich_backend.dto.UpdateEmployeeInfoDto;
import com.limhaekyu.eco_rich_backend.mapper.EmpDetailsViewMapper;
import com.limhaekyu.eco_rich_backend.repository.EmpDetailsViewRepository;
import com.limhaekyu.eco_rich_backend.service.EmployeesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeesServiceImpl implements EmployeesService {

    private final EmpDetailsViewRepository empDetailsViewRepository;
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

    @Override
    public void updateInfo(Long employeeId, UpdateEmployeeInfoDto updateEmployeeInfo) {

    }

    @Override
    public void increaseSalaryOfDepartment(Long departmentId, BigDecimal increaseRate) {

    }

    private EmpDetailsView findEmployeeInfo(Long employeeId) {
        return empDetailsViewRepository.findByEmployeeId(employeeId).orElseThrow(() -> new IllegalArgumentException("등록되지 않은 직원 ID 입니다."));
    }
}
