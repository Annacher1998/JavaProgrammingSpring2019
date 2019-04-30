package day23;
import java.util.Scanner;
public class Warmup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// check  prime number is  a whole number>1and can not be made by multiplying other whole numbers
		Scanner scan=new Scanner(System.in);
				
		System.out.println("Please enter a number:");
		int num=scan.nextInt();
		int rem=0;
		for(int i=2;i<num;i++) {
			if(num % i==0){
				rem++;
			System.out.println("Its not  a prime number");
			return;
			}
		}
				System.out.println("its a prime number");
			
		
		
		
		
	}

}
