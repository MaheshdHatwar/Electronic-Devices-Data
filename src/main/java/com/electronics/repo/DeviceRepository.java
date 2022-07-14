package com.electronics.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.electronics.Entity.Device;

public interface DeviceRepository extends JpaRepository<Device, Long> {

}
