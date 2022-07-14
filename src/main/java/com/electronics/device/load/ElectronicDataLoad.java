package com.electronics.device.load;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

import com.electronics.Entity.Device;
import com.electronics.repo.DeviceRepository;

public class ElectronicDataLoad {
	private static final Logger log = LoggerFactory.getLogger(ElectronicDataLoad.class);
	
	CommandLineRunner initLoadUniversityData(DeviceRepository deviceRepository) {
		return ArgsAnnotationPointcut -> {
			log.info("Preloading "+deviceRepository.save(new Device(1, "Redmi 6","cell Phone",7000)));
			log.info("Preloading "+deviceRepository.save(new Device(1, "iphone","cell Phone",70000)));
			log.info("Preloading "+deviceRepository.save(new Device(1, "Mcbook","Laptop",170000)));
};
	}}
