package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Book;
import model.entities.Eletronic;
import model.entities.Product;
import model.entities.ShoppingCart;

public class Program {

	public static void main(String[] args) {
		
		// Set default locale to US to format numbers with dot as decimal separator.
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		// Create a new shopping cart instance.
		ShoppingCart cart = new ShoppingCart();
		
		// Ask the user how many products to add.
		System.out.print("How many products? ");
		int n = sc.nextInt();
		
		// Loop to read product information.
		for(int i=1; i<=n; i++) {
			sc.nextLine(); // Consume the leftover newline.
			System.out.println("\nProduct #" + i);
			System.out.print("Book or eletronic (b/e)? ");
			String category = sc.nextLine().toUpperCase(); // Convert input to uppercase for consistency.
			
			// If the product is a Book
			if(category.equals("BOOK") || category.equals("B")) {
				System.out.print("Title: ");
				String title = sc.nextLine();
				System.out.print("Author: ");
				String author = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				
				// Create a Book object and add to the cart.
				Product book = new Book(title, author, price);
				cart.addProduct(book);
			}
			
			// If the product is an Eletronic
			else {
				System.out.print("Brand: ");
				String brand = sc.nextLine();
				System.out.print("Model: ");
				String model = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				
				// Create an Eletronic object and add to the cart.
				Product eletronic = new Eletronic(brand, model, price);
				cart.addProduct(eletronic);
			}
		}
		
		// Display all products in the cart.
		cart.displayProducts();
		
		sc.close();

	}

}
