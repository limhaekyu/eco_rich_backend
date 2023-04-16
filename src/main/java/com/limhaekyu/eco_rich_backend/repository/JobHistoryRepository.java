package com.limhaekyu.eco_rich_backend.repository;

import com.limhaekyu.eco_rich_backend.domain.JobHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobHistoryRepository extends JpaRepository<JobHistory, Long>, JobHistoryQueryRepository {
}
