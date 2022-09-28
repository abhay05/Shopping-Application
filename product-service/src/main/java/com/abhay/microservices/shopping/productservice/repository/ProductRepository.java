package com.abhay.microservices.shopping.productservice.repository;

import com.abhay.microservices.shopping.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product,String>{
	
}
