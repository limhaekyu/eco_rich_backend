package com.limhaekyu.eco_rich_backend.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "job_history")
public class JobHistory {
    @Id
    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "job_id")
    private String jobId;

    @Column(name = "department_id")
    private Long departmentId;
}
