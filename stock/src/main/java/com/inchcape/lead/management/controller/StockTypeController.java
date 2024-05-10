package com.inchcape.lead.management.controller;

import com.inchcape.lead.management.entity.StockType;
import com.inchcape.lead.management.service.StockTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stockType")
public class StockTypeController {
    @Autowired
    private StockTypeService stockTypeService;

    @GetMapping
    public List<StockType> getAllStockType(){
        return stockTypeService.getAllStockType();
    }

    @GetMapping("/{id}")
    public StockType getStockType(@PathVariable Long id){
        return stockTypeService.getStockType(id);
    }

    @PostMapping
    public StockType createStockType(@RequestBody StockType stockType){
        return stockTypeService.createStockType(stockType);
    }

    @PutMapping("/{id}")
    public StockType updateStockType(@PathVariable Long id, @RequestBody StockType stockType){
        return stockTypeService.updateStockType(id, stockType);
    }

    @DeleteMapping("/{id}")
    public void deleteStockType(@PathVariable Long id){
        stockTypeService.deleteStockType(id);
    }

}
