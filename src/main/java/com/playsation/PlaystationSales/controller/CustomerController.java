package com.playsation.PlaystationSales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.playsation.PlaystationSales.model.Customer;
import com.playsation.PlaystationSales.repository.DataSetRepository;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    // esta classe receberá as requisições http
    @Autowired
    private DataSetRepository dataSetRepository;

    @GetMapping("/showall")
    public List<Customer> listAllCustomer(){
        return dataSetRepository.findAll();
    }


}
