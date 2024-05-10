package com.inchcape.lead.management.repository;

import com.inchcape.lead.management.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}

