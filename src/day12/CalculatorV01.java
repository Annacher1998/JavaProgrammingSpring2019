package day12;
import java.util.Scanner;
public class CalculatorV01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
		double firstNumber,secondNumber,result;
		
		System.out.println("Enter first number:");
		firstNumber=scan.nextDouble();
		System.out.println("enter second number:");
		secondNumber=scan.nextDouble();
		System.out.println("Select operator: +,-,*,/,%");
		String operator=scan.next();
		if(operator.equals("+")) {
			System.out.println(firstNumber + secondNumber);
		}
		else if(operator.equals("-")) {
			result=firstNumber - secondNumber;
		}
		else if (operator.equals("*")) {
			result=firstNumber * secondNumber;
		}
		else if (operator.equals("/")) {
			result=firstNumber / secondNumber;
		}
		else if (operator.equals("%")) {
			result=firstNumber % secondNumber;
		
		}
		
		
		}

}
