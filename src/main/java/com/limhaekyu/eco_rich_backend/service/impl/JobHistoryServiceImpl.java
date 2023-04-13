package com.limhaekyu.eco_rich_backend.service.impl;

import com.limhaekyu.eco_rich_backend.dto.HistoryOfEmployeeDto;
import com.limhaekyu.eco_rich_backend.service.JobHistoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobHistoryServiceImpl implements JobHistoryService {
    @Override
    public List<HistoryOfEmployeeDto> findHistory(Long employeeId) {
        return null;
    }
}
