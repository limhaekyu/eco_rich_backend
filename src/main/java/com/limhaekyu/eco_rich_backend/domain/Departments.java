package com.limhaekyu.eco_rich_backend.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "departments")
public class Departments {
    @Id
    @Column(name = "department_id")
    private Long departmentId;

    @Column(name = "department_name")
    private String departmentName;

    // 연관관계???
    @Column(name = "manager_id")
    private Long managerId;

    // 연관관계?
    @Column(name = "location_id")
    private Long locationId;

}
