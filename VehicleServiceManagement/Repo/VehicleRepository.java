package com.aits.VechicleServiceManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aits.VechicleServiceManagement.Entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {}
