package com.inchcape.lead.management.controller;

import com.inchcape.lead.management.entity.VehicleType;
import com.inchcape.lead.management.service.VehicleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicleType")
public class VehicleTypeController {
    @Autowired
    VehicleTypeService vehicleTypeService;

    @GetMapping
    public List<VehicleType> getAllVehicleTypes(){
        return vehicleTypeService.getAllVehicleTypes();
    }

    @GetMapping("/{id}")
    public VehicleType getVehicleById(@PathVariable Long id){
        return vehicleTypeService.getVehicleTypeById(id);
    }

    @PostMapping
    public VehicleType createVehicleType(@RequestBody VehicleType vehicleType){
        return vehicleTypeService.createVehicleType(vehicleType);
    }

    @PutMapping("/{id}")
    public VehicleType updateVehicleType(@PathVariable Long id,@RequestBody VehicleType vehicleType){
        return vehicleTypeService.updateVehicleType(id,vehicleType);
    }

    @DeleteMapping("/{id}")
    public void deleteVehicleType(@PathVariable Long id){
        vehicleTypeService.deleteVehicleType(id);
    }
}
