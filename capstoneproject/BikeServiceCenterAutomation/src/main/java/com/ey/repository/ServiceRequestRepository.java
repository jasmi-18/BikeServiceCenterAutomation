package com.ey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ey.entity.ServiceRequest;

public interface ServiceRequestRepository extends JpaRepository<ServiceRequest, Long> {
}