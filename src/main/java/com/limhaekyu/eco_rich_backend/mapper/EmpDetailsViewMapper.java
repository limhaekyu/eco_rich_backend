package com.limhaekyu.eco_rich_backend.mapper;

import com.limhaekyu.eco_rich_backend.domain.EmpDetailsView;
import com.limhaekyu.eco_rich_backend.dto.CurrentEmployeeInfoDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EmpDetailsViewMapper {
    EmpDetailsViewMapper INSTANCE = Mappers.getMapper(EmpDetailsViewMapper.class);

    EmpDetailsView dtoToEntity(CurrentEmployeeInfoDto currentEmployeeInfo);

    CurrentEmployeeInfoDto entityToDto(EmpDetailsView empDetailsView);
}