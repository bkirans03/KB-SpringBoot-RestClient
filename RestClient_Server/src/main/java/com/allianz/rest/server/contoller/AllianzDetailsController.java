package com.allianz.rest.server.contoller;


import com.allianz.rest.server.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class AllianzDetailsController {



    @GetMapping("/getCustomerData")
    public List<Customer> getCustomerDetails(){
        return Arrays.asList(new Customer("1","Kiran","kiran.b@allianz.com","LongTerm"),
                new Customer("2","Kaushal","kaushal.m@allianz.com","LongTerm"),
                new Customer("3","Arun","arun.y@allianz.com","LongTerm"),
                new Customer("4","Shiva","shavi.p@allianz.com","LongTerm"));
    }
}
