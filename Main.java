public class Main {

	public static void main(String[] args) {
		
		Laptop d = new Laptop();
		d.setBrand();
		d.setModel();
		d.setColor();
		d.setProcessor();
		d.setPrice();
		
		System.out.println("--\nLAPTOP 1--");
		System.out.println("Brand: " + d.getBrand());
		System.out.println("Model: " + d.getModel());
		System.out.println("Color: " + d.getColor());
		System.out.println("Processor: " + d.getProcessor());
		System.out.println("Price: RM" + d.getPrice());
		d.Promotion();
		
		System.out.println();
		
		Laptop v = new Laptop();
		v.setBrand();
		v.setModel();
		v.setColor();
		v.setProcessor();
		v.setPrice();	
		
		System.out.println("--\nLAPTOP2--");
		System.out.println("Brand: " + v.getBrand());
		System.out.println("Model: " + v.getModel());
		System.out.println("Color: " + v.getColor());
		System.out.println("Processor: " + v.getProcessor());
		System.out.println("Price: RM" + v.getPrice());
		d.Promotion();
	}
}
