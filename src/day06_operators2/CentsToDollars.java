package day06_operators2;

public class CentsToDollars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int minutes= 125;
	// 2 hours 5 min
		int hours;
		int remainingMinutes;
		
	
		
		hours = minutes / 60;
		System.out.println(hours);
		
		remainingMinutes = minutes % 60;
		System.out.println(remainingMinutes);
		System.out.print(minutes + " minutes is ");
		System.out.println(hours+ " hours, "+ remainingMinutes + " minutes");
		
	}

}
