package com.limhaekyu.eco_rich_backend.domain;

import lombok.Getter;
import org.springframework.data.annotation.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Immutable
@Getter
@Table(name = "emp_details_view")
public class EmpDetailsView {

    // employees
    @Id
    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "job_id")
    private String jobId;

    @Column(name = "manager_id")
    private Long managerId;

    @Column(name = "department_id")
    private Long departmentId;

    // departments
    @Column(name = "location_id")
    private Long locationId;

    // locations
    @Column(name = "country_id")
    private char countryId;

    // employees
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "salary")
    private BigDecimal salary;

    @Column(name = "commission_pct")
    private BigDecimal commissionPct;

    // departments
    @Column(name = "department_name")
    private String departmentName;

    // jobs
    @Column(name = "job_title")
    private String jobTitle;

    // locations
    @Column(name = "city")
    private String city;

    @Column(name = "state_province")
    private String stateProvince;

    // countries
    @Column(name = "country_name")
    private String countryName;

    // regions
    @Column(name = "region_name")
    private String regionName;
}
