package com.bruno.dsdeliver.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bruno.dsdeliver.dto.ProductDTO;
import com.bruno.dsdeliver.services.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping(value = "/products")
	public ResponseEntity<List<ProductDTO>> findAll(){
		List<ProductDTO> list = productService.findAll();
		return ResponseEntity.ok().body(list);
	}

}