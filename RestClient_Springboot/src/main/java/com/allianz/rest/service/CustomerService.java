package com.allianz.rest.service;


import com.allianz.rest.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class CustomerService {


    private final RestClient restClient;

    public CustomerService(RestClient restClient) {
        this.restClient = restClient;
    }

    public CustomerService() {
        restClient = RestClient.builder().baseUrl("http://localhost:8083")
                .build();
    }

    public List<Customer> getAllCustomerDetails() {
        return restClient.get().uri("/getCustomerData")
                .retrieve()
                .body(new ParameterizedTypeReference<List<Customer>>() {
                });
    }


}
