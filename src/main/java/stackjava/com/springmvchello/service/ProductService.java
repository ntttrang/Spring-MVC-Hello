package stackjava.com.springmvchello.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import stackjava.com.springmvchello.model.Product;

public class ProductService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public List<Product> getProducts() {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "Iphone XS", 10));
		products.add(new Product(2, "SamSung S9", 12));
		products.add(new Product(3, "Nokia", 23));
		return products;
	}
}
