package com.abhay.microservices.shopping.productservice.controller;

import java.util.*;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.abhay.microservices.shopping.productservice.model.Product;
import com.abhay.microservices.shopping.productservice.repository.ProductRepository;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void put(@RequestBody Product product) {
		productRepository.save(product);
	}
}
