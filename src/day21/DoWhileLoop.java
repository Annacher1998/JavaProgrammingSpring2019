package day21;
import java.util.Scanner;
public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int sum;

do {	
	System.out.println("Please enter 2 numbers");
     int num1=scan.nextInt();
	int num2=scan.nextInt();	
	sum=num1+num2;

}while(sum<=100); 
	System.out.println("Good numbers");


	}

}
