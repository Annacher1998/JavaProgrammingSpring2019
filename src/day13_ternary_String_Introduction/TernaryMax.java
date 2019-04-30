package day13_ternary_String_Introduction;

public class TernaryMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int max;
 int num1=100;
 int num2=50;
max = num1 > num2 ? num1 : num2;
 
		System.out.println("Max:"+ max);
		
		
		
		String result ;
		int score=68;
		/*if (score>70) {
			result ="pass";
		}else {
			result="fail";
		}
		*/
		
		result =score>60 ? "pass": "fail";
		
		
		System.out.println("Result is: "+result);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
