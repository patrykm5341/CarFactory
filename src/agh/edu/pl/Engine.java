package agh.edu.pl;

public class Engine extends CarComponent{
	
	Double displacement;
	FuelType fuelType;
	
	public Engine(String name, Double price, Double displacement, FuelType fuelType) {
		super(name, price);
		this.displacement = displacement;
		this.fuelType = fuelType;
	}
	
	public Double getDisplacement() {
		return this.displacement;
	};
	public FuelType getFuelType() {
		return this.fuelType;
	}

	
	

}
