package com.ey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ey.entity.Reminder;

public interface ReminderRepository extends JpaRepository<Reminder, Long> {
Reminder findByServiceRequestId(Long serviceRequestId);
}