package com.limhaekyu.eco_rich_backend.repository;

import com.limhaekyu.eco_rich_backend.domain.EmpDetailsView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmpDetailsViewRepository extends JpaRepository<EmpDetailsView, Integer> {
    List<EmpDetailsView> findAll();
}
