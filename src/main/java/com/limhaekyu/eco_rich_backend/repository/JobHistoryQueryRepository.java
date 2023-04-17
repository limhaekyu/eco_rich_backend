package com.limhaekyu.eco_rich_backend.repository;

import com.limhaekyu.eco_rich_backend.dto.HistoryOfEmployeeDto;

import java.util.List;

public interface JobHistoryQueryRepository {
    List<HistoryOfEmployeeDto> findJobHistory(Long employeeId);
}
