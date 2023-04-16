package com.limhaekyu.eco_rich_backend.repository;

import com.limhaekyu.eco_rich_backend.dto.DepartmentInfoDto;
import com.limhaekyu.eco_rich_backend.dto.HistoryOfEmployeeDto;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.limhaekyu.eco_rich_backend.domain.QCountries.countries;
import static com.limhaekyu.eco_rich_backend.domain.QDepartments.departments;
import static com.limhaekyu.eco_rich_backend.domain.QJobHistory.jobHistory;
import static com.limhaekyu.eco_rich_backend.domain.QJobs.jobs;
import static com.limhaekyu.eco_rich_backend.domain.QLocations.locations;
import static com.limhaekyu.eco_rich_backend.domain.QRegions.regions;

@Repository
@RequiredArgsConstructor
public class JobHistoryQueryRepositoryImpl implements JobHistoryQueryRepository{

    private final JPAQueryFactory queryFactory;

    @Override
    public List<HistoryOfEmployeeDto> findJobHistory(Long employeeId) {
        return queryFactory
                .select(
                        Projections.constructor(HistoryOfEmployeeDto.class, jobHistory.startDate, jobHistory.startDate, jobs.jobId, jobs.jobTitle,
                                Projections.constructor(DepartmentInfoDto.class, departments.departmentId, departments.departmentName,
                                        locations.locationId, locations.streetAddress, locations.postalCode, locations.city,
                                        locations.stateProvince, countries.countryId, countries.countryName, regions.regionName)))
                .from(jobHistory)
                .innerJoin(jobs).on(jobs.jobId.eq(jobHistory.jobId))
                .innerJoin(departments).on(departments.departmentId.eq(jobHistory.departmentId))
                .innerJoin(locations).on(locations.locationId.eq(departments.locationId))
                .innerJoin(countries).on(countries.countryId.eq(locations.countryId))
                .innerJoin(regions).on(regions.regionId.eq(countries.regionId))
                .where(jobHistory.employeeId.eq(employeeId))
                .fetch();
    }


}
