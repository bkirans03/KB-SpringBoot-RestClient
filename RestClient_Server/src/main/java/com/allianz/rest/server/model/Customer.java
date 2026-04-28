package com.allianz.rest.server.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private String CustomerId;
    private String CustomerName;
    private String email;
    private String termType;
}
