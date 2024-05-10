package com.inchcape.lead.management;

import com.inchcape.lead.management.entity.Make;
import com.inchcape.lead.management.entity.StockType;
import com.inchcape.lead.management.entity.Vehicle;
import com.inchcape.lead.management.entity.VehicleType;
import com.inchcape.lead.management.entity.enums.FuelType;
import com.inchcape.lead.management.entity.enums.Status;
import com.inchcape.lead.management.entity.enums.Transmission;
import com.inchcape.lead.management.repository.MakeRepository;
import com.inchcape.lead.management.repository.StockTypeRepository;
import com.inchcape.lead.management.repository.VehicleRepository;
import com.inchcape.lead.management.repository.VehicleTypeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static com.inchcape.lead.management.entity.StockType.*;

@SpringBootApplication
public class ManagementApplication {

	private static final Logger log = LoggerFactory.getLogger(ManagementApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ManagementApplication.class, args);
		log.info("Hello Billy!");
	}
//	@Bean
//	public CommandLineRunner loadMakeData(MakeRepository makeRepository){
//		return args ->
//		{
//			Make make1 = Make.builder()
//					.id(1L)
//					.created(LocalDateTime.now())
//					.modified(LocalDateTime.now())
//					.make("Toyota")
//					.build();
//
//			Make make2 = Make.builder()
//					.id(2L)
//					.created(LocalDateTime.now())
//					.modified(LocalDateTime.now())
//					.make("Honda")
//					.build();
//
//			Make make3 = Make.builder()
//					.id(3L)
//					.created(LocalDateTime.now())
//					.modified(LocalDateTime.now())
//					.make("Ford")
//					.build();
//
//			makeRepository.save(make1);
//			makeRepository.save(make2);
//			makeRepository.save(make3);
//		};
//	}
//
//	@Bean
//	public CommandLineRunner loadVehicleTypeData(VehicleTypeRepository vehicleTypeRepository){
//		return args ->
//		{
//			VehicleType vehicleType1 = VehicleType.builder()
//					.id(1L)
//					.created(LocalDateTime.now())
//					.modified(LocalDateTime.now())
//					.type("SUV")
//					.build();
//
//			VehicleType vehicleType2 = VehicleType.builder()
//					.id(2L)
//					.created(LocalDateTime.now())
//					.modified(LocalDateTime.now())
//					.type("Bike")
//					.build();
//
//			VehicleType vehicleType3 = VehicleType.builder()
//					.id(3L)
//					.created(LocalDateTime.now())
//					.modified(LocalDateTime.now())
//					.type("LCV")
//					.build();
//
//			vehicleTypeRepository.save(vehicleType1);
//			vehicleTypeRepository.save(vehicleType2);
//			vehicleTypeRepository.save(vehicleType3);
//		};
//	}
//
//	@Bean
//	public CommandLineRunner loadStockTypeData(StockTypeRepository stockTypeRepository){
//		return args ->
//		{
//			StockType stockType1 = StockType.builder()
//					.id(1L)
//					.created(LocalDateTime.now())
//					.modified(LocalDateTime.now())
//					.type("New")
//					.build();
//
//			StockType stockType2 = StockType.builder()
//					.id(2L)
//					.created(LocalDateTime.now())
//					.modified(LocalDateTime.now())
//					.type("Used")
//					.build();
//
//			stockTypeRepository.save(stockType1);
//			stockTypeRepository.save(stockType2);
//		};
//	}
//
//	@Bean
//	public CommandLineRunner loadVehicleData(
//			VehicleRepository vehicleRepository,
//			MakeRepository makeRepository,
//			VehicleTypeRepository vehicleTypeRepository,
//			StockTypeRepository stockTypeRepository
//	) {
//		return args -> {
//			// Get existing make, vehicleType, and stockType data
//			List<Make> makes = makeRepository.findAll();
//			List<VehicleType> vehicleTypes = vehicleTypeRepository.findAll();
//			List<StockType> stockTypes = stockTypeRepository.findAll();
//
//			// Check if data exists
//			if (makes.isEmpty() || vehicleTypes.isEmpty() || stockTypes.isEmpty()) {
//				throw new RuntimeException("Make, VehicleType, or StockType data is missing");
//			}
//
//			// Dummy Vehicle data
//			Vehicle vehicle1 = Vehicle.builder()
//					.created(LocalDateTime.now())
//					.modified(LocalDateTime.now())
//					.bhp(150)
//					.co2Emissions(new BigDecimal("120.5"))
//					.combinedFuelConsumption(new BigDecimal("6.2"))
//					.doors(4)
//					.engineSize(new BigDecimal("2.0"))
//					.exteriorColour("Red")
//					.fuelType(FuelType.PETROL)
//					.keyFeatures("Keyless entry, Alloy wheels, Parking sensors")
//					.make(makes.get(0))
//					.model("Camry")
//					.price(new BigDecimal("25000"))
//					.regNumber("ABC123")
//					.regDate(LocalDate.now().minusYears(1))
//					.seats(5)
//					.specification("Automatic transmission, Leather seats")
//					.stockNumber("STK001")
//					.stockType(stockTypes.get(0))
//					.transmission(Transmission.AUTOMATIC)
//					.vehicleType(vehicleTypes.get(0))
//					.status(Status.AVAILABLE)
//					.build();
//
//			Vehicle vehicle2 = Vehicle.builder()
//					.created(LocalDateTime.now())
//					.modified(LocalDateTime.now())
//					.bhp(120)
//					.co2Emissions(new BigDecimal("95.2"))
//					.combinedFuelConsumption(new BigDecimal("5.5"))
//					.doors(2)
//					.engineSize(new BigDecimal("1.5"))
//					.exteriorColour("Blue")
//					.fuelType(FuelType.DIESEL)
//					.keyFeatures("ABS, Airbags, Remote central locking")
//					.make(makes.get(1))
//					.model("Civic")
//					.price(new BigDecimal("20000"))
//					.regNumber("XYZ456")
//					.regDate(LocalDate.now().minusYears(2))
//					.seats(4)
//					.specification("Manual transmission, Cloth seats")
//					.stockNumber("STK002")
//					.stockType(stockTypes.get(1))
//					.transmission(Transmission.MANUAL)
//					.vehicleType(vehicleTypes.get(1))
//					.status(Status.SOLD)
//					.build();
//
//			Vehicle vehicle3 = Vehicle.builder()
//					.created(LocalDateTime.now())
//					.modified(LocalDateTime.now())
//					.bhp(180)
//					.co2Emissions(new BigDecimal("130.8"))
//					.combinedFuelConsumption(new BigDecimal("7.0"))
//					.doors(5)
//					.engineSize(new BigDecimal("2.5"))
//					.exteriorColour("Black")
//					.fuelType(FuelType.PETROL)
//					.keyFeatures("Sunroof, Navigation system, LED headlights")
//					.make(makes.get(2))
//					.model("Escape")
//					.price(new BigDecimal("30000"))
//					.regNumber("DEF789")
//					.regDate(LocalDate.now().minusYears(1))
//					.seats(5)
//					.specification("Automatic transmission, Leather seats")
//					.stockNumber("STK003")
//					.stockType(stockTypes.get(0))
//					.transmission(Transmission.AUTOMATIC)
//					.vehicleType(vehicleTypes.get(0))
//					.status(Status.AVAILABLE)
//					.build();
//
//			Vehicle vehicle4 = Vehicle.builder()
//					.created(LocalDateTime.now())
//					.modified(LocalDateTime.now())
//					.bhp(140)
//					.co2Emissions(new BigDecimal("105.0"))
//					.combinedFuelConsumption(new BigDecimal("5.8"))
//					.doors(3)
//					.engineSize(new BigDecimal("1.8"))
//					.exteriorColour("White")
//					.fuelType(FuelType.PETROL)
//					.keyFeatures("Climate control, Alloy wheels, Rear-view camera")
//					.make(makes.get(0))
//					.model("Corolla")
//					.price(new BigDecimal("22000"))
//					.regNumber("GHI101")
//					.regDate(LocalDate.now().minusYears(2))
//					.seats(5)
//					.specification("Automatic transmission, Cloth seats")
//					.stockNumber("STK004")
//					.stockType(stockTypes.get(1))
//					.transmission(Transmission.AUTOMATIC)
//					.vehicleType(vehicleTypes.get(1))
//					.status(Status.AVAILABLE)
//					.build();
//
//			Vehicle vehicle5 = Vehicle.builder()
//					.created(LocalDateTime.now())
//					.modified(LocalDateTime.now())
//					.bhp(90)
//					.co2Emissions(new BigDecimal("80.3"))
//					.combinedFuelConsumption(new BigDecimal("4.5"))
//					.doors(2)
//					.engineSize(new BigDecimal("1.0"))
//					.exteriorColour("Silver")
//					.fuelType(FuelType.PETROL)
//					.keyFeatures("Power steering, Central locking")
//					.make(makes.get(1))
//					.model("Jazz")
//					.price(new BigDecimal("18000"))
//					.regNumber("JKL202")
//					.regDate(LocalDate.now().minusYears(3))
//					.seats(5)
//					.specification("Manual transmission, Cloth seats")
//					.stockNumber("STK005")
//					.stockType(stockTypes.get(0))
//					.transmission(Transmission.MANUAL)
//					.vehicleType(vehicleTypes.get(1))
//					.status(Status.SOLD)
//					.build();
//
//			// Save dummy vehicle data
//			vehicleRepository.save(vehicle1);
//			vehicleRepository.save(vehicle2);
//			vehicleRepository.save(vehicle3);
//			vehicleRepository.save(vehicle4);
//			vehicleRepository.save(vehicle5);
//		};
}
