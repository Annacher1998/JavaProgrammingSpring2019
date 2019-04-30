package day24;

import java.util.Arrays;

public class LotteryTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] lotteryNumbers= {12,45, 3,62,42,90};
		System.out.println(Arrays.toString(lotteryNumbers));
		
		
		// we sort numbers lowest to highest
		Arrays.sort(lotteryNumbers);
		System.out.println(Arrays.toString(lotteryNumbers));
		
		// binary search works only with sorted arrays
		int index=Arrays.binarySearch(lotteryNumbers,90);
		System.out.println("Position :"+index);
		// if value does not exist
		int index1=Arrays.binarySearch(lotteryNumbers,5);
		System.out.println("Position :"+index1);
		System.out.println();
	}

}
