package agh.edu.pl;

import java.util.ArrayList;
import java.util.List;

public class CarBuilder {
	
	private List<Equipment> equipment = new ArrayList<Equipment>();
	private Engine engine;
	private Model model;
	
	
	public void setEngine(Engine e) {
		this.engine = e;
	}

	public void addEquipment(Equipment e) {
		this.equipment.add(e);
	}
	
	public Car build() {
		return null;
	}

	public List<Equipment> getEquipment() {
		return this.equipment;
	}

	public void setEquipment(List<Equipment> equipment) {
		this.equipment = equipment;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}
	
	public Car getCar() {
		return new Car(this);
	}
	
	
	
}
