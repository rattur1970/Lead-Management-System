package com.inchcape.lead.management.service;

import com.inchcape.lead.management.entity.Make;
import com.inchcape.lead.management.repository.MakeRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MakeService {
    @Autowired
    private MakeRepository makeRepository;

    @Transactional(readOnly = true)
    public List<Make> getAllMakes(){
        return makeRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Make getMakeById(Long id){
        return makeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Make not found with id: " + id));
    }

    @Transactional
    public Make createMake(Make make){
        return makeRepository.save(make);
    }

    @Transactional
    public Make updateMake(Long id, Make make){
        Make existingMake = getMakeById(id);
        existingMake.setMake(make.getMake());
        existingMake.setModified(LocalDateTime.now());
        return makeRepository.save(existingMake);
    }

    @Transactional
    public Make deleteMake(Long id){
        Make deleted = getMakeById(id);
        makeRepository.deleteById(id);
        return deleted;
    }
}
