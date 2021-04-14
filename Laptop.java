import java.util.Scanner;

public class Laptop {
	
	Scanner s = new Scanner(System.in);

	String brand;
	String model;
	String color;
	String processor;
	double price;
	
	 // Create Setter Method
	  public void setBrand() {
		  System.out.println("Enter brand: ");
		  this.brand = s.nextLine();
	  }
	  
	  public void setModel() {
		  System.out.println("Enter model: ");
		  this.model = s.nextLine();
	  }
	  
	  public void setColor() {
		  System.out.println("Enter color: ");
		  this.color = s.nextLine();
	  }
	  
	  public void setProcessor() {
		  System.out.println("Enter processor type: ");
		  this.processor = s.nextLine();
	  }
	  
	  public void setPrice() {
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
