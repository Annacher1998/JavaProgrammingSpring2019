package day11;

public class truthTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("### Truth Table fro && operator ####");
		System.out.println("When true and true - result is : "+ (true && true));// true 
		System.out.println("When true and false - result is: "+ (true&& false) );// false
		System.out.println("When false && true - result is "+ (false && true));// false 
		System.out.println("When false&& false - result is "+ (false&&false));// false
		
		System.out.println();
	
		System.out.println("### Truth Table for || operator ###");
		System.out.println("When true or true - result is "+ (true || true));// true 
		System.out.println("When true or false-result is "+ (true || false));// true
	    System.out.println("When false or true - resilt is  "+ (false || true ));// true
	    System.out.println("When false || false - result is "+ ( false || false));// false
	
	    System.out.println();
	
	    System.out.println("### Truth table for !( NOT)  operator ####");
	    System.out.println("When !true- result is "+ (!true));// false
	    System.out.println("When !false-result is "+ (!false));// true
   
	
	}

}
