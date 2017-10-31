package com.rao.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * Created by raovinay on 18-03-2017.
 */
public @Data class Product {

    //this is the db key
    @Id private String id;
    //this is something we will use
    private String uniqueId;
    private String description;
    private double price;
}
