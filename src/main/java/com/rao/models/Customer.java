package com.rao.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by raovinay on 18-03-2017.
 */
public @Data class Customer {

    //this is the db key
    @Id private String id;
    //this is something we will use
    private String customerId;
    private String phone;
    private String customerName;
}
