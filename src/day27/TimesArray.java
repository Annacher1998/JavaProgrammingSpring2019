package day27;
import java.util.Scanner;

public class TimesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int[] time1 = new int[2];
		int[] time2 = new int[2];


		System.out.println("Please enter your time line in hours and minutes");
		time1[0] = scan.nextInt();
		time1[1] = scan.nextInt();
		System.out.println("Please enter your second time line in hours and minutes");
		time2[0] = scan.nextInt();
		time2[1] = scan.nextInt();
		//
		if (time1[0] < 0 || time1[0] > 23) {
			System.out.println("Invalid time");
		return;
		}
		if (time1[1] < 0 || time1[1] > 59) {
			System.out.println("Invalid time");
			return;
		}
		 if (time2[0] < 0 || time2[0] > 23) {
			System.out.println("Invalid time");
		return;
		}
		
		 if (time2[1] < 0 || time2[1] > 59) {
			System.out.println("Invalid time");
			return;
		}
		 //
		 
		if (time1[0] < time2[0]) {
			System.out.println("Time1 is earlier");
		} else if (time2[0] < time1[0]) {
			System.out.println("Time2 is earlier");
		}
		if (time1[0] == time2[0]&&(time1[1] < time2[1]) ) {
		
				System.out.println("time1 is earlier");
			} else if(time1[0] == time2[0]&&time2[1] < time1[1]){
				System.out.println("time2 is earlier");
			}
		if(time1[0] == time2[0]&&time1[1]==time2[1]) {
			System.out.println("Same time");
		}
		
		
		

		
	}

}
