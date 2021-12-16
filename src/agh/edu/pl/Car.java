package agh.edu.pl;

import java.util.stream.Collectors;

public class Car {
	
	private CarBuilder carBuilder;
	
	public Car(CarBuilder carBuilder) {
		this.carBuilder = carBuilder;
	}
	
	public String getDescription() {
		String modelName = this.carBuilder.getModel().getName();
		String engineName = this.carBuilder.getEngine().getName();
		String equipmentList = this.carBuilder.getEquipment().stream().map(x -> x.getName()).collect(Collectors.joining(","));
                
		return "This is a " + modelName + ".\nIts engine is " + engineName + ".\nIt contains: " + equipmentList + ".\nIt costs " + this.getPrice();
	}
	
	
	public Double getPrice() {
		
		Double price = this.carBuilder.getEquipment().stream().mapToDouble(eq -> eq.getPrice()).sum();
		price += this.carBuilder.getEngine().getPrice();
		price += this.carBuilder.getModel().getPrice();
		
		return price;
	}
	

}
