package com.vn.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vn.model.Product;

@RestController
public class HomeController {
	
	@RequestMapping(value= {"/home", "", "/" , "/index"})
	public List<Product> getProduct() {
		System.out.println("1");
		// fake data
		Product product = new Product();
		product.setName("Test");
		ArrayList<Product> arrayList = new ArrayList<Product>();
		arrayList.add(product);
		arrayList.add(product);
		arrayList.add(product);
		
		return arrayList;
	}

	@PostMapping("/home")
	public List<Product> getProduct2() {
		System.out.println("3");
		// fake data
		Product product = new Product();
		product.setName("Test");
		ArrayList<Product> arrayList = new ArrayList<Product>();
		arrayList.add(product);
		arrayList.add(product);
		arrayList.add(product);
		
		return arrayList;
	}
}
