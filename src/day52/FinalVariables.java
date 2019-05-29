package day52;

public class FinalVariables {

	final int MAX_RANGE=610;//you can assign value right away
	public final int Model_3_max_Speed;
	public final int Model_X_passengers;
	 public final String Jan="January";
	
	 
	 public static final String ADMIN_USERNAME;
	 static {
		 ADMIN_USERNAME="anna.dhdsfjs129921@gmail.com";
	 }
	// CONSTRUCTOR
	public FinalVariables() {//assign value in constructor
		Model_3_max_Speed=610;
	}
	
	/* public FinalVariables(int num) {//assign value in constructor
		Model_3_max_Speed=num;
	}
	*/
	
	
	///INIT BLOCK
	
	{//assigning variable in init block 
		Model_X_passengers=7;
	}
	
	public static void main(String[] args) {
	
		
		final int MAX_PASSENGERS_COUNT=5;
		final double PI=.14159265358979323846;
		System.out.println(MAX_PASSENGERS_COUNT);
		
		final int SSN;
		SSN=3145688;
		
		
		FinalVariables finalVars=new FinalVariables();
		System.out.println("Max range for roadster: "+ finalVars.MAX_RANGE);
		System.out.println("Model 3 max speed:"+ finalVars.Model_3_max_Speed);
		System.out.println("Model x max passengers:"+ finalVars.Model_X_passengers);
		
		System.out.println("Admin: "+ADMIN_USERNAME);
		
}
	
	
}
