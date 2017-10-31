package com.rao.repo;

import com.rao.models.Customer;
import com.rao.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by raovinay on 18-03-2017.
 */

@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface CustomerRepo extends MongoRepository<Customer, String>{
    List<Product> findByCustomerId(@Param("customerId") String customerId);
}