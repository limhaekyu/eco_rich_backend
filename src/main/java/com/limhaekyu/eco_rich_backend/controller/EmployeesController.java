package com.limhaekyu.eco_rich_backend.controller;

import com.limhaekyu.eco_rich_backend.dto.CurrentEmployeeInfoDto;
import com.limhaekyu.eco_rich_backend.dto.DepartmentAndLocationDto;
import com.limhaekyu.eco_rich_backend.dto.HistoryOfEmployeeDto;
import com.limhaekyu.eco_rich_backend.dto.UpdateEmployeeInfoDto;
import com.limhaekyu.eco_rich_backend.service.EmployeesService;
import com.limhaekyu.eco_rich_backend.service.JobHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employee")
public class EmployeesController {

    private final EmployeesService employeesService;
    private final JobHistoryService jobHistoryService;

    /*
        특정 직원 현재 정보 조회 API
    */
    @GetMapping("/{employee_id}")
    public ResponseEntity<CurrentEmployeeInfoDto> findCurrentEmployeeInfo(@PathVariable(name = "employee_id") Long employeeId) {
        CurrentEmployeeInfoDto currentEmployeeInfo = employeesService.findCurrentInfo(employeeId);
        return ResponseEntity.ok(currentEmployeeInfo);
    }

    /*
        특정 직원 이력 조회 API
    */
    @GetMapping("/{employee_id}/history")
    public ResponseEntity<List<HistoryOfEmployeeDto>> findHistoryOfEmployee(@PathVariable(name = "employee_id") Long employeeId) {
        List<HistoryOfEmployeeDto> historyOfEmployee = jobHistoryService.findHistory(employeeId);
        if (historyOfEmployee.isEmpty()){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
        }
        return ResponseEntity.ok(historyOfEmployee);
    }

    /*
        특정 직원 부서 및 위치 정보 조회 API
    */
    @GetMapping("/{employee_id}/department")
    public ResponseEntity<DepartmentAndLocationDto> findDepartmentAndLocation(@PathVariable(name = "employee_id") Long employeeId) {
        DepartmentAndLocationDto departmentAndLocation = employeesService.findDepartmentAndLocation(employeeId);
        return ResponseEntity.ok(departmentAndLocation);
    }

    /*
        특정 직원 정보 업데이트 API
    */
    @PatchMapping("/{employee_id}")
    public void updateEmployeeInfo(@PathVariable(name = "employee_id") Long employeeId, @RequestBody UpdateEmployeeInfoDto updateEmployeeInfo) {
        employeesService.updateInfo(employeeId, updateEmployeeInfo);
    }

    /*
        특정 부서 급여 특정 비율로 인상 API - 우선 url에 정보포함, post
    */
    @PostMapping("/department/{department_id}")
    public void increaseSalary(@PathVariable(name = "department_id") Long departmentId, @RequestParam BigDecimal increaseRate) {
        employeesService.increaseSalaryOfDepartment(departmentId, increaseRate);
    }
}
