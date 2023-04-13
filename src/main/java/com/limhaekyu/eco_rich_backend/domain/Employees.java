package com.limhaekyu.eco_rich_backend.domain;

import com.limhaekyu.eco_rich_backend.dto.UpdateEmployeeInfoDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "employees")
public class Employees {
    @Id
    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "hire_date")
    private Date hireDate;

    // 관계?
    @Column(name = "job_id")
    private String jobId;

    @Column(name = "salary")
    private BigDecimal salary;

    @Column(name = "commission_pct")
    private BigDecimal commissionPct;

    // 관계?
    @Column(name = "manager_id")
    private Long managerId;

    // 관계?
    @Column(name = "department_id")
    private Long departmentId;

    public void updateInfo(UpdateEmployeeInfoDto updateEmployeeInfo) {
        if (StringUtils.hasText(updateEmployeeInfo.getFirstName())) {
            this.firstName = updateEmployeeInfo.getFirstName();
        }
        if (StringUtils.hasText(updateEmployeeInfo.getLastName())) {
            this.lastName = updateEmployeeInfo.getLastName();
        }
        if (StringUtils.hasText(updateEmployeeInfo.getEmail())) {
            this.email = updateEmployeeInfo.getEmail();
        }
        if (StringUtils.hasText(updateEmployeeInfo.getPhoneNumber())) {
            this.phoneNumber = updateEmployeeInfo.getPhoneNumber();
        }
        if (StringUtils.hasText(String.valueOf(updateEmployeeInfo.getSalary()))) {
            this.salary = updateEmployeeInfo.getSalary();
        }
        if (StringUtils.hasText(String.valueOf(updateEmployeeInfo.getCommissionPct()))) {
            this.commissionPct = updateEmployeeInfo.getCommissionPct();
        }
        if (StringUtils.hasText(String.valueOf(updateEmployeeInfo.getDepartmentId()))) {
            this.departmentId = updateEmployeeInfo.getDepartmentId();
        }
    }
}
