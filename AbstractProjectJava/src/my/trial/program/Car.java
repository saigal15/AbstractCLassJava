package my.trial.program;

public abstract class Car {
	
	public abstract void brake();
	public abstract void speed();

	

	

	public static void main(String[] args) {
	//Car car = new Car();//cannot instantiate the abstract class
		CarChild1 car = new CarChild1();
		car.brake();
		
		
		
	 CarChild2 car1 = new CarChild2();
	 car1.brake();
	 car1.speed();

	

	}
	
	

		
	}
	
	
	



