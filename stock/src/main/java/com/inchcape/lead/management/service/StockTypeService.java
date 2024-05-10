package com.inchcape.lead.management.service;

import com.inchcape.lead.management.entity.StockType;
import com.inchcape.lead.management.repository.StockTypeRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StockTypeService {
    @Autowired
    private StockTypeRepository stockTypeRepository;

    @Transactional(readOnly = true)
    public List<StockType> getAllStockType(){
        return stockTypeRepository.findAll();
    }

    @Transactional(readOnly = true)
    public StockType getStockType(Long id){
        return stockTypeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("StockType not found with id: " + id));
    }

    @Transactional
    public StockType createStockType(StockType stockType){
        return stockTypeRepository.save(stockType);
    }

    @Transactional
    public StockType updateStockType(Long id, StockType stockType){
        StockType stockType1 = getStockType(id);
        stockType1.setType(stockType.getType());
        stockType1.setModified(LocalDateTime.now());
        return stockTypeRepository.save(stockType1);
    }

    @Transactional
    public void deleteStockType(Long id){
        stockTypeRepository.deleteById(id);
    }
}
