package model.entities;

import java.util.ArrayList;
import java.util.List;

//This class represents a shopping cart that holds a list of products.
public class ShoppingCart {

	// List to store products added to the cart. It uses the Product interface.
	private List<Product> products = new ArrayList<Product>();

	public List<Product> getProducts() {
		return products;
	}
	
	// Adds a product to the shopping cart.
	public void addProduct(Product product) {
		products.add(product);
	}
	
	// Removes a product to the shopping cart.
	public void removeProduct(Product product) {
		products.remove(product);
	}
	
	// Calculates and returns the total price of all products in the cart.
	public double getTotal() {
		double sum = 0;
		for (Product x : products) {
			sum += x.getPrice();
		}
		return sum;
	}
	
	// Displays all products currently in the cart.
	public void displayProducts() {
		System.out.println("------------------------");
		System.out.println("Products in cart:");
		for(Product x : products) {
			System.out.println(x.getDescription());
		}
		System.out.println("Total: $" + String.format("%.2f", getTotal()));
	}
}
