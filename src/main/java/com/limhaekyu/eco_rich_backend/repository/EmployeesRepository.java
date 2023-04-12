package com.limhaekyu.eco_rich_backend.repository;

import com.limhaekyu.eco_rich_backend.domain.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepository extends JpaRepository<Employees, Long> {
}
