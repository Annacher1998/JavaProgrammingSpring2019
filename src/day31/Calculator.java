package day31;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
add(0,10);
substract(8,3);
multiply(3,5);
divide(0,7);
remainder(10,4);
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter 2 numbers");
	double n1=scan.nextDouble();
	double n2=scan.nextDouble();
	System.out.println("Select operator:+,-,%,*,/");
	String operator=scan.next();
	switch(operator) {
	case "+":
		add(n1,n2);
		break;
	case "/":
		divide(n1,n2);
		break;
	case "-":
		substract(n1,n2);
		break;
	case "*":
		multiply(n1,n2);
	break;
	case "%":
		remainder(n1,n2);
	break;
	default:
		System.out.println("Invalid operator");
	}
	
	}

	
	//add, subtract, multiply, divide, remainder
	
	public static void add(double num1,double num2) {
		
		double result = num1 + num2;
		System.out.println("Result: " + result);
	}
		public static void substract(double num1,double num2) {
double result= num1 - num2;
		
		System.out.println("Substract: " + result);
		}
		public static void multiply(double num1, double num2) {
		double result = num1 * num2;
		System.out.println("Multiply: " + result);
		}
		public static void divide(double num1,double num2) {
		
		if((num1<=0)||num2<=0) {
			System.out.println("Can not divide by 0");
			return;
		}else {
			double result=num1/num2;
			System.out.println("Divide: " +result );
		}
		}
		public static void remainder(double num1,double num2) {
		double result = num1 % num2;

		System.out.println("Remainder: " + result);
	}
}
