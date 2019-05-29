package day50;

public class FullTimeEmployee extends Employee {

	
	@Override
	public void calculatePay(int hours,double rate) {
		
		//shoul include 5 %bonus
		System.out.println("FullTimeEmployee total pay: "+ ((hours*rate)*1.05));
	}
}
