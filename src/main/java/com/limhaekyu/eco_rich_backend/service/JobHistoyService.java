package com.limhaekyu.eco_rich_backend.service;

import com.limhaekyu.eco_rich_backend.dto.HistoryOfEmployeeDto;

import java.util.List;

public interface JobHistoyService {
    List<HistoryOfEmployeeDto> findHistory(int employeeId);
}
