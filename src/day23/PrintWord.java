package day23;

public class PrintWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Java";
		// update statement 
		for(int i=0;i<str.length();i++) {
			//condition
			if(str.substring(i,i+1).equals("a")){
				//if condition is true,go back to update statement 
				continue;
				
			}
			System.out.print(str.substring(i,i+1));
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
