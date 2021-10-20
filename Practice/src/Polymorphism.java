
public class Polymorphism {
	public static void main(String[] args) {
		
		//creating a new instance
		
		Vehicle vehicle1 = new Vehicle();
		
		//another instance of car class
		Car car = new Car ();
		
		//If we have a subclass of a superclass we could always use subclass where we can use superclass
		// Ex. If we create a another instance of vehicle2. we can make this reference point to the reference vehicle1,
		//because it is pointed to the object Vehicle
		
		//Vehicle vehicle2 = vehicle1;
		
		//As car is a subclass of a vehicle we can also use car in the instance vehicle2
		
		//reference here is pointing towards car which is also a vehicle
		Vehicle vehicle2 = car;
		
		// As the ref. pointing to car its gonna run the car class
		//when you call a method in polymorphism its not type of the reference ..its the object the reference is pointing at
		//Here ref. is vehicle and object is car
		
		vehicle2.design();
	
		car.drive();
		car.park();
		
		//Another method
		createDesign(car);		
	}
	//A new method create design passing an argument  type vehicle
	public static void createDesign(Vehicle vehicle) {
		
		vehicle.design();
		
		
	
}
	
}
