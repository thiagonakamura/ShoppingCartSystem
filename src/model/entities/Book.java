package model.entities;

// The Book class implements the Product interface, 
// meaning it must define getPrice() and getDescription().
public class Book implements Product{

	// Fields to store the title, author, and price of the book.
	private String title;
	private String author;
	private Double price;
	
	
	// Constructor to initialize the book's title, author, and price.
	public Book(String title, String author, Double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	// Implementation of the getPrice() method from the Product interface.
	@Override
	public double getPrice() {
		return price;
	}
	
	// Implementation of the getDescription() method from the Product interface.
	@Override
	public String getDescription() {
		return "Book: " + title + " by " + author + " - $" + String.format("%.2f", price);
	}
}
