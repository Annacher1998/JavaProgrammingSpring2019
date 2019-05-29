package day52;
import java.util.*;
public class FinalArrays {
public static void main(String[] args) {
	
	
		final int[] TEAMS = new int[]{ 11, 11 };
		System.out.println("Team 1: " + TEAMS[0]);
		System.out.println("Team 2: " + TEAMS[1]);

		TEAMS[0]=10;
		TEAMS[1]=9;
		System.out.println("Team 1: " + TEAMS[0]);
		System.out.println("Team 2: " + TEAMS[1]);
		
		int[] nums=new int[] {23,55,3343};
		System.out.println(Arrays.toString(nums));
		
		
		nums=new int[] {23,34435,353,52,313,3434};		
		System.out.println(Arrays.toString(nums));

		
		final int[] finalNums={34,34,21,23,231,1,134};
		System.out.println(Arrays.toString(finalNums));
		finalNums[0]=12;
		System.out.println(Arrays.toString(finalNums));
		
		final double prices[] =new double [3];
		prices[0]=86.6;
		prices[1]=44.5;
		prices[2]=99.98;
		
		System.out.println(Arrays.toString(prices));
		prices[0]=77.6;
		System.out.println(Arrays.toString(prices));
		
		//prices=new double[3];
		
		
	}
}
