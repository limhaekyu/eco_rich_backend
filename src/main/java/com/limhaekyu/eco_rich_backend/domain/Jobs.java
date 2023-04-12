package com.limhaekyu.eco_rich_backend.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "jobs")
public class Jobs {
    @Id
    @Column(name = "job_id")
    private String jobId;

    @Column(name = "job_title")
    private String jobTitle;

    // DECIMAL(8.0) 설정 필요할 수도
    @Column(name = "min_salary")
    private BigDecimal minSalary;

    // DECIMAL(8.0) 설정 필요할 수도
    @Column(name = "max_salary")
    private BigDecimal maxSalary;
}
