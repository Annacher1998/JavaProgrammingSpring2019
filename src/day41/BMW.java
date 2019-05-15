package day41;

public class BMW {

	String make="BMW";
	String model;
	double price;
	
	
	public void showPrice() {
		if(model.equalsIgnoreCase("740i Sedan")) {
			price=86050.00;
			System.out.println("And price for "+model+" is "+price);
		}else if(model.equalsIgnoreCase("330i Sedan")) {
			price=40250.00;
			System.out.println("And price for "+model+" is "+price);
		}else if(model.equalsIgnoreCase("M3 Sedan")) {
			price=66550.00;
			System.out.println("And price for "+model+" is "+price);
		}else {
			System.out.println(model+" is not found");
		}
		
		
	}
	
	
}
