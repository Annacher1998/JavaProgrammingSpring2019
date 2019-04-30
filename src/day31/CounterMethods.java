package day31;
import java.util.*;

public class CounterMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
countUp(3);
countDown(8);
	

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter number");
	int num1=scan.nextInt();
	countUp(num1);
	}		
	
	
	public static void countUp(int num) {
		if(num<1) {
			System.out.println("Invalid number");
		}
		for(int i=1;i<=num;i++) {
			System.out.print(i+" ");
			
			
		}
		System.out.println();
	}
	public static void countDown(int num) {
		for(int j=num;j>=1;j--) {
			System.out.print(j+" ");
			
		}
		System.out.println();
	}
	
	
}
