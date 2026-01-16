package com.ey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ey.entity.Estimation;

public interface EstimationRepository extends JpaRepository<Estimation, Long> {
Estimation findByServiceRequestId(Long serviceRequestId);
}