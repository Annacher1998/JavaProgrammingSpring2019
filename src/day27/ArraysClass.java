package day27;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {1,3,34,2,4,5,8};
		
		// //////////toString methods//////////
		String num=Arrays.toString(nums);
		//System.out.println(Arrays.toString(nums));
		System.out.println(num);
		// sort methods///
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		String[] languages= { "Spanish","Zulu", "Italian","Polish", "Arabic", "Uzbek"};
		
		System.out.println(Arrays.toString(languages));
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
		int num1[]= {16,7,5,4,79,78,65};
		//find lowest and largest values from num1
		int lowest=num1[0];
		int largest=num1[num1.length-1];
        System.out.println("Lowest numbers : "+ lowest);
		System.out.println("Largest numbers:"+ largest);
		
		
		
		
		
		
	}

}
