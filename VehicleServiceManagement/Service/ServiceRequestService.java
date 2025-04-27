package com.aits.VechicleServiceManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aits.VechicleServiceManagement.Entity.ServiceRequest;
import com.aits.VechicleServiceManagement.Repo.ServiceRequestRepository;

import java.util.List;

@Service
public class ServiceRequestService {
    @Autowired
    private ServiceRequestRepository serviceRepo;

    public List<ServiceRequest> getAllRequests() {
        return serviceRepo.findAll();
    }

    public ServiceRequest saveRequest(ServiceRequest request) {
        return serviceRepo.save(request);
    }
}
