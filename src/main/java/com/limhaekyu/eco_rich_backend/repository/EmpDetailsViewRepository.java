package com.limhaekyu.eco_rich_backend.repository;

import com.limhaekyu.eco_rich_backend.domain.EmpDetailsView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmpDetailsViewRepository extends JpaRepository<EmpDetailsView, Integer> {

    Optional<EmpDetailsView> findByEmployeeId(Long employeeId);
}
