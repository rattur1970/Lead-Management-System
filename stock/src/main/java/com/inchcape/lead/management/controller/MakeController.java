package com.inchcape.lead.management.controller;

import com.inchcape.lead.management.entity.Make;
import com.inchcape.lead.management.entity.Vehicle;
import com.inchcape.lead.management.service.MakeService;
import com.inchcape.lead.management.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/makes")
public class MakeController {
    @Autowired
    private MakeService makeService;

    @GetMapping
    public List<Make> getAllMakes() {
        return makeService.getAllMakes();
    }

    @GetMapping("/{id}")
    public Make getMakeById(@PathVariable Long id) {
        return makeService.getMakeById(id);
    }

    @PostMapping
    public Make createMake(@RequestBody Make make) {
        return makeService.createMake(make);
    }

    @PutMapping("/{id}")
    public Make updateMake(@PathVariable Long id, @RequestBody Make make) {
        return makeService.updateMake(id,make);
    }

    @DeleteMapping("/{id}")
    public Make deleteMake(@PathVariable Long id) {
        return makeService.deleteMake(id);
    }
}
