package day33;

public class PayCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=getHourlyPay(90,13);
		System.out.println("And you total is: "+total+"$");
	}
public static int getHourlyPay(int hours,int rate) {
	int totalPay=rate*hours;
	if(hours<=0) {
		System.out.println("invalid hours");
		return 0;
		
	}
	
	if(rate<=0) {
		System.out.println("invalid rate");
		return 0;
	}
	return totalPay;
	
}
}
