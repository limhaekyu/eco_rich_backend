package com.limhaekyu.eco_rich_backend.mapper;

import com.limhaekyu.eco_rich_backend.domain.JobHistory;
import com.limhaekyu.eco_rich_backend.dto.HistoryOfEmployeeDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface JobHistoryMapper {
    JobHistoryMapper INSTANCE = Mappers.getMapper(JobHistoryMapper.class);

    JobHistory dtoToEntity(HistoryOfEmployeeDto historyOfEmployeeDto);

    HistoryOfEmployeeDto entityToDto(JobHistory jobHistory);

    List<HistoryOfEmployeeDto> toDtoList(List<JobHistory> jobHistories);
}
