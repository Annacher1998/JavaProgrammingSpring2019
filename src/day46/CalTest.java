package day46;

public class CalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		double result=Calculator.plus(55, 7);//static way calling method
		System.out.println(result);
		
		result=Calculator.minus(44,14);
		System.out.println(result);
		
		result=Calculator.multiply(23,5);
		System.out.println(result);
		Calculator c=new Calculator();
		c.multiply(22, 3);
		
		
	}

}
