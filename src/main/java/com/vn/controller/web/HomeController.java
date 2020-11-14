package com.vn.controller.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vn.model.Product;

@Controller(value="HomeController2")
public class HomeController {

	@RequestMapping("/home2")
	public @ResponseBody List<Product> getProduct() {
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
