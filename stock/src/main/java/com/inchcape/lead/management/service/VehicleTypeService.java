package com.inchcape.lead.management.service;

import com.inchcape.lead.management.entity.VehicleType;
import com.inchcape.lead.management.repository.VehicleTypeRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class VehicleTypeService {

    @Autowired
    private VehicleTypeRepository vehicleTypeRepository;

    @Transactional(readOnly = true)
    public List<VehicleType> getAllVehicleTypes() {
        return vehicleTypeRepository.findAll();
    }

    @Transactional(readOnly = true)
    public VehicleType getVehicleTypeById(Long id) {
        return vehicleTypeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Vehicle type not found with id: " + id));
    }

    @Transactional
    public VehicleType createVehicleType(VehicleType vehicleType) {
        return vehicleTypeRepository.save(vehicleType);
    }

    @Transactional
    public VehicleType updateVehicleType(Long id, VehicleType vehicleType) {
        VehicleType existingVehicleType = getVehicleTypeById(id);
        existingVehicleType.setType(vehicleType.getType());
        existingVehicleType.setModified(LocalDateTime.now());
        return vehicleTypeRepository.save(existingVehicleType);
    }
    @Transactional
    public void deleteVehicleType(Long id) {vehicleTypeRepository.deleteById(id);}
}