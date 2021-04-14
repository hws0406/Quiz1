import java.util.Scanner;

public class Laptop {

	String brand;
	String model;
	String color;
	String processor;
	double price;
	
	Scanner s = new Scanner(System.in);
	
	 // Create Setter Method
	  public void setBrand(String brand) {
		  System.out.println("Enter brand: ");
		  this.brand = s.nextLine();
	  }
	  
	  public void setModel(String model) {
		  System.out.println("Enter model: ");
		  this.model = s.nextLine();
	  }
	  
	  public void setColor(String color) {
		  System.out.println("Enter color: ");
		  this.color = s.nextLine();
	  }
	  
	  public void setProcessor(String processor) {
		  System.out.println("Enter processor type: ");
		  this.processor = s.nextLine();
	  }
	  
	  public void setPrice(double price) {
		  this.price = s.nextDouble();
	  }

	  // Create Getter Method
	  public String getBrand() {
		  return this.brand;
	  }
	  
	  public String getModel() {
		  return this.model;
	  }
	  
	  public String getColor() {
	 	  return this.color;
 	  }
	  
	  public String getProcessor() {
		  return this.processor;
	  }

	  public double getPrice() {
		  return this.price;
	  }
	  
	  public void Promotion() {
		System.out.println("This laptop is worth to buy!");
	}
}
