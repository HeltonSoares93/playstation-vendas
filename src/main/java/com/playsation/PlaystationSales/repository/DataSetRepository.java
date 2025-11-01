package com.playsation.PlaystationSales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.playsation.PlaystationSales.model.Customer;

@Repository
public interface DataSetRepository extends JpaRepository<Customer, Long> {

}
