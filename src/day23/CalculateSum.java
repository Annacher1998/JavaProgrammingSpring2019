package day23;
import java.util.Scanner;
public class CalculateSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scan=new Scanner(System.in) ;
		System.out.println("Please enter numbers");
		int num=0;
		int sum=0;
	for(int i=0;i<6;i++) {
		System.out.println("Enter a number");
		num=scan.nextInt();
		if(num<=0) {
			continue;
		}
		sum+=num;
		
	}
		System.out.println("And your total : "+sum);
		

		
	}

}
