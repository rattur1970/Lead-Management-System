package com.inchcape.lead.management.service;

import com.inchcape.lead.management.entity.Vehicle;
import com.inchcape.lead.management.repository.VehicleRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Transactional(readOnly = true)
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Vehicle getVehicleById(Long id) {
        return vehicleRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Vehicle not found with id: " + id));
    }

    @Transactional
    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Transactional
    public Vehicle updateVehicle(Long id, Vehicle updatedVehicle) {
        Vehicle existingVehicle = getVehicleById(id);
        existingVehicle.setBhp(updatedVehicle.getBhp());
        return vehicleRepository.save(existingVehicle);
    }

    @Transactional
    public Vehicle deleteVehicle(Long id) {
        Vehicle deleted = getVehicleById(id);
        vehicleRepository.deleteById(id);
        return deleted;
    }
}

