package agh.edu.pl;

public class Main {

	public static void main(String[] args) {
		
		CarBuilder carBuilder = new CarBuilder();
		
		Engine engine = new Engine("Nowy silniczek", 1010.99, 1.4, FuelType.PETROL);
		Model model = new Model("Skoda Wrabia", 150000.00);
		Equipment eq = new Equipment("Szyber Hiper Dach", 1000.00);

		carBuilder.setEngine(engine);
		carBuilder.setModel(model);
		carBuilder.addEquipment(eq);
		
		System.out.println(carBuilder.getCar().getDescription());

	}

}
