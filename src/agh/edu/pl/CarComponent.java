package agh.edu.pl;

public abstract class CarComponent {
	
	String name;
	Double price;
	
	public CarComponent(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return this.name;
	}
	public Double getPrice() {
		return this.price;
	}
	public String getDescription() {
		return "Name: " + this.name + "\nPrice: " + this.price; 	
	}

}
