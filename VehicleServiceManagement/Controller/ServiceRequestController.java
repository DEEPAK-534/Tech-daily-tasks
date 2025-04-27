package com.aits.VechicleServiceManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.aits.VechicleServiceManagement.Entity.ServiceRequest;
import com.aits.VechicleServiceManagement.Service.ServiceRequestService;

import java.util.List;

@RestController
@RequestMapping("/api/servicerequests")
public class ServiceRequestController {
    @Autowired
    private ServiceRequestService requestService;

    @GetMapping
    public List<ServiceRequest> getRequests() {
        return requestService.getAllRequests();
    }

    @PostMapping
    public ServiceRequest addRequest(@RequestBody ServiceRequest request) {
        return requestService.saveRequest(request);
    }
}
