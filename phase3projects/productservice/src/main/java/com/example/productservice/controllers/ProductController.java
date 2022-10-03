package com.example.productservice.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.productservice.entity.Product;
import com.example.productservice.exceptions.ProductNotFoundException;
import com.example.productservice.repository.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductRepository repo;
	
	@GetMapping
	public Iterable<Product> getProducts() {
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return repo.findAll();
	}
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable("id") Integer id) {
		Optional<Product> optProduct = repo.findById(id);
		if (optProduct.isEmpty()) {
			throw new ProductNotFoundException(id);
		}
		System.out.println(optProduct.get());
		System.out.println("test print 2");
		System.out.println("TEST PRINT 3");
		return optProduct.get();
	}
	
	@PostMapping
	public Product create(@RequestBody Product product) {
		return repo.save(product);
	}
	 
	@PutMapping
	public Product update(@RequestBody Product product) {
		return repo.save(product);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		repo.deleteById(id);
	}
	
}
