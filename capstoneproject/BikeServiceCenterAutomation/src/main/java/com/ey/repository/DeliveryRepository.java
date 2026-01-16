package com.ey.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ey.entity.Delivery;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
Delivery findByServiceRequestId(Long serviceRequestId);
List<Delivery> findByStatus(String status);
}