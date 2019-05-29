package day50;

public class Contractor extends Employee{

	
	
	@Override
	public void calculatePay(int hours,double rate) {
		
		
		System.out.println("Contractor total pay: "+ ((hours*rate)+200));
	}
}
