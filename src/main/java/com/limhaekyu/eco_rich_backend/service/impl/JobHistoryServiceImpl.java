package com.limhaekyu.eco_rich_backend.service.impl;

import com.limhaekyu.eco_rich_backend.domain.JobHistory;
import com.limhaekyu.eco_rich_backend.dto.HistoryOfEmployeeDto;
import com.limhaekyu.eco_rich_backend.mapper.JobHistoryMapper;
import com.limhaekyu.eco_rich_backend.repository.EmployeesRepository;
import com.limhaekyu.eco_rich_backend.repository.JobHistoryRepository;
import com.limhaekyu.eco_rich_backend.service.JobHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class JobHistoryServiceImpl implements JobHistoryService {
    private final JobHistoryRepository jobHistoryRepository;
    private final EmployeesRepository employeesRepository;
    @Override
    public List<HistoryOfEmployeeDto> findHistory(Long employeeId) {
        if(!isExistEmployee(employeeId)) {
            throw new IllegalArgumentException("존재하지 않은 직원 ID 입니다.");
        }
        List<JobHistory> jobHistories = jobHistoryRepository.findAllByEmployeeId(employeeId).orElseThrow(()->new IllegalArgumentException("해당 직원의 이력이 없습니다."));
        return JobHistoryMapper.INSTANCE.toDtoList(jobHistories);
    }

    private boolean isExistEmployee(Long employeeId) {
        return employeesRepository.existsById(employeeId);
    }
}
