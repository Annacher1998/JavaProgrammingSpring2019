package day10;

public class ifStatmentWithBooleanVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean breakTime=false;
		if ( breakTime) {
			System.out.println("Break till 8.35 pm");
		}else {
			System.out.println("");
		}
		
		//second version
		
		if ( breakTime == true) {
			System.out.println("Break till 8.35 pm");
		}else {
			System.out.println("");
		}
		 
boolean classTime=true;
if(classTime==true) {
	System.out.println("Come back on time");
	System.out.println("Stop talking");
	System.out.println("Pay Attention");
	System.out.println("Code and have fun");
}else {
	System.out.println("Take a walk and have some water.");
}

boolean qualified = false;
if ( qualified ==false ) {
	System.out.println("Your application was not approved.");
}else {
	System.out.println("talk");
}
		
		
		
		
		
	}

}
