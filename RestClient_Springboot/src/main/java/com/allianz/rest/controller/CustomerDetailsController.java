package com.allianz.rest.controller;


import com.allianz.rest.model.Customer;
import com.allianz.rest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerDetailsController {


    @Autowired
    private CustomerService customerService;


    @GetMapping("/getCustomers")
    public List<Customer> getCustomerData(){
        return customerService.getAllCustomerDetails();
    }





}
