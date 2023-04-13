package com.limhaekyu.eco_rich_backend.repository;

import com.limhaekyu.eco_rich_backend.domain.JobHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface JobHistoryRepository extends JpaRepository<JobHistory, Long> {
    Optional<List<JobHistory>> findAllByEmployeeId(Long employeeId);
}
