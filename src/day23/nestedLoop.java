package day23;

public class nestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//print num frm 1-10
		
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		
		
		// another way to repeat numbers
		
		System.out.println();
		for(int j=1;j<=2;j++) {
			
			System.out.println("********************");
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		}
		System.out.println("********************");
	
	
	}

}
