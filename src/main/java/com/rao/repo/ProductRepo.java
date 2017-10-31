package com.rao.repo;

import java.util.List;

import com.rao.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by raovinay on 18-03-2017.
 */

@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductRepo extends MongoRepository<Product, String>{
    List<Product> findByUniqueId(@Param("uniqueId") String uniqueId);
}