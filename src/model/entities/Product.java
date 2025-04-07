package model.entities;

//Interface that defines the contract for any class representing a Product.
public interface Product {

	// Method that should return the price of the product.
	double getPrice();
	
	// Method that should return a description of the product.
	String getDescription();
}
