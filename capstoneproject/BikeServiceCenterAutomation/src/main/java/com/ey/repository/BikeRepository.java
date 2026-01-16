package com.ey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ey.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {
}
