package day11;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner( System.in);
		boolean isRushHour;
		double price=0.0;
		System.out.println("Enter vichle type 1 or 2:");//1,2
		int carType = scan.nextInt();
		System.out.println("Is it rush hour: yes or no");
		String rushHour=scan.next();
		// if rushHour String is yes => assign true to isrushhour variable if no assign false to isrudhHour variable
		if (rushHour.equalsIgnoreCase("yes")) {
			isRushHour=true;
		}else {
			isRushHour=false;
			}
		// System.out.println(isRushHour);
			if ( carType ==1) {
				if(isRushHour) {
				price = 30.0;
				}else {
					price=5.0;
				}
			
			}else if(carType==2) {
				if(isRushHour) {
					price=55.30;
				}else {
					price=15.50;
				}		
			}
	
	System.out.println("Toll cost is "+price);
	

		
		
		
		
		
	}	
		
	}


