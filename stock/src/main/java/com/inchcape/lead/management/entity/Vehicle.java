package com.inchcape.lead.management.entity;

import com.inchcape.lead.management.entity.enums.FuelType;
import com.inchcape.lead.management.entity.enums.Status;
import com.inchcape.lead.management.entity.enums.Transmission;
import jakarta.persistence.*;
import lombok.*;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="vehicle")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime created;

    private LocalDateTime modified;

    private Integer bhp;

    private BigDecimal co2Emissions;

    private BigDecimal combinedFuelConsumption;

    private Integer doors;

    private BigDecimal engineSize;

    private String exteriorColour;

    @Enumerated(EnumType.STRING)
    private FuelType fuelType;

    @Lob
    private byte[] images;

    @Column(length = 2000)
    private String keyFeatures;

    @ManyToOne
    private Make make;

    private String model;

    private BigDecimal price;

    private String regNumber;

    private LocalDate regDate;

    private Integer seats;

    @Column(length = 2000)
    private String specification;

    private String stockNumber;

    @ManyToOne
    private StockType stockType;

    @Enumerated(EnumType.STRING)
    private Transmission transmission;

    @ManyToOne
    private VehicleType vehicleType;

    @Enumerated(EnumType.STRING)
    private Status status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    public Integer getBhp() {
        return bhp;
    }

    public void setBhp(Integer bhp) {
        this.bhp = bhp;
    }

    public BigDecimal getCo2Emissions() {
        return co2Emissions;
    }

    public void setCo2Emissions(BigDecimal co2Emissions) {
        this.co2Emissions = co2Emissions;
    }

    public BigDecimal getCombinedFuelConsumption() {
        return combinedFuelConsumption;
    }

    public void setCombinedFuelConsumption(BigDecimal combinedFuelConsumption) {
        this.combinedFuelConsumption = combinedFuelConsumption;
    }

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public BigDecimal getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(BigDecimal engineSize) {
        this.engineSize = engineSize;
    }

    public String getExteriorColour() {
        return exteriorColour;
    }

    public void setExteriorColour(String exteriorColour) {
        this.exteriorColour = exteriorColour;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public byte[] getImages() {
        return images;
    }

    public void setImages(byte[] images) {
        this.images = images;
    }

    public String getKeyFeatures() {
        return keyFeatures;
    }

    public void setKeyFeatures(String keyFeatures) {
        this.keyFeatures = keyFeatures;
    }

    public Make getMake() {
        return make;
    }

    public void setMake(Make make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(String stockNumber) {
        this.stockNumber = stockNumber;
    }

    public StockType getStockType() {
        return stockType;
    }

    public void setStockType(StockType stockType) {
        this.stockType = stockType;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}


