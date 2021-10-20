
// As its a subclass of vehicle its shows extends
public class Car extends Vehicle {

	
	//overriding the method vehicle
	@Override
	public void design() {
		System.out.println("Car Design");
	} 
	// adding another method 
	public void drive() {
		System.out.println("Driving the Car");
		
	}
	public void park() {
		System.out.println("Parking the Car");
	}

}
