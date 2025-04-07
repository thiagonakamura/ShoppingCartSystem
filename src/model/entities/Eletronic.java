package model.entities;

// The Eletronic class implements the Product interface, 
// so it must provide implementations for getPrice() and getDescription().
public class Eletronic implements Product{

    // Fields to store the brand, model, and price of the electronic product.
	private String brand;
	private String model;
	private Double price;
	
	
	// Constructor to initialize the electronic's brand, model, and price.
	public Eletronic(String brand, String model, Double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	// Implementation of getPrice() from the Product interface.
	@Override
	public double getPrice() {
		return price;
	}

	// Implementation of getDescription() from the Product interface.
	@Override
	public String getDescription() {
		return "Eletronic: " + brand + " - " + model + " - $" + String.format("%.2f", price);
	}

}
