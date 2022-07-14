package com.electronics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.electronics.Entity.Device;
import com.electronics.repo.DeviceRepository;

@SpringBootApplication
@RestController
public class ElectronicsDevicesDataApplication {

	@Autowired
	private DeviceRepository deviceRepository;
	
	@PostMapping("/device")
	public Device addDevice(@RequestBody Device device) {
		return deviceRepository.save(device);
	}
		
	@GetMapping
	 public List<Device> getDevices(){
		 return deviceRepository.findAll();
	 }
	
	public static void main(String[] args) {
		SpringApplication.run(ElectronicsDevicesDataApplication.class, args);
	}

}
