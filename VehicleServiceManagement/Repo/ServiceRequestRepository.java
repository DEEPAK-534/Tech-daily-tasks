package com.aits.VechicleServiceManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aits.VechicleServiceManagement.Entity.ServiceRequest;

public interface ServiceRequestRepository extends JpaRepository<ServiceRequest, Long> {}
