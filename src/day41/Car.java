package day41;

public class Car {

	
	
	
	
	 String make;
   String model;
   int currentSpeed;
    String color;

public void printCarInfo() {
	System.out.println("Computer make "+"["+make+"]"+","+ "model ["+model+"]"+","+"color ["+color+"]"+","+"current Speed ["+currentSpeed+"]");
}
public void  showCurrentSpeed(int speedLimit) {
	
	if(currentSpeed<=speedLimit) {
		System.out.println(make+ " is driving at " + currentSpeed +" mph, following speed limit - "+speedLimit);
	}else if(currentSpeed>speedLimit) {
		System.out.println(make+" is driving at "+currentSpeed +" mph, over the speed limit- "+speedLimit);
	}else {
		System.out.println("Invalid data");
	}
	
}

public void drive() {
	System.out.println(make+" "+ model+" is driving...");
}

public void accellerate(int mph) {
	currentSpeed=currentSpeed+mph;

}


}
