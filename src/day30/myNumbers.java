package day30;
import java.util.*;
public class myNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMe5Numbers();
		do10PushUps() ;
		rangePrint();
	}

	public static void showMe5Numbers() {
		Random random=new Random();
	for(int i=1;i<=5;i++) {
		System.out.print(random.nextInt(1001)+" ");
	
		}
		System.out.println();
		
		
		//return type:void
		
	}
	 public static void do10PushUps() {
		 
		 for(int i=1;i<=10;i++) {
			System.out.println("Pushup- "+i);
			
			 }
			  System.out.println("Time to rest");

	 }
	
	public static void rangePrint() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your numbers:");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		if(num1<num2) {
			for(int i=num1;i<=num2;i++) {
				System.out.print(i+" ");
			}
			
		}else if(num1>num2) {
				for(int i=num1;i>=num2;i--) {
					System.out.print(i+" ");
			}
				
		}else if(num1==num2){
			System.out.println(num1);
		}
	}
	
	
	
}
