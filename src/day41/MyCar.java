package day41;

public class MyCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car honda= new Car();
		honda.make="Honda";
		honda.model="Civic";
		honda.color="white";
		honda.currentSpeed=44;
		
		System.out.println("####CAR INFORMATION####");
		
		honda.printCarInfo();
		
		honda.showCurrentSpeed(25);
		honda.drive();
		System.out.println("Before: "+honda.currentSpeed);
		honda.accellerate(20);
		System.out.println("After: "+honda.currentSpeed);
		
	}

}
