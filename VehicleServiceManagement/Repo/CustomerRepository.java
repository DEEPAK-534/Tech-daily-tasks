package com.aits.VechicleServiceManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aits.VechicleServiceManagement.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {}

