package stackjava.com.springmvchello.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import stackjava.com.springmvchello.model.Product;

@Controller
public class ProductController {
	@GetMapping("/getProducts")
	public String getProducts(Model model) {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "Iphone XS", 10));
		products.add(new Product(2, "SamSung S9", 12));
		products.add(new Product(3, "Nokia", 23));
		model.addAttribute("products", products);
		return "productList";
	}
}
