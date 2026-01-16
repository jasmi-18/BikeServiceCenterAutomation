package com.ey.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ey.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
List<Payment> findByServiceRequestId(Long serviceRequestId);
}