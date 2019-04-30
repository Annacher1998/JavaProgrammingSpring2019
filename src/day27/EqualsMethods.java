package day27;

import java.util.Arrays;

public class EqualsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num1 = { 3, 4, 5 };
		int[] num2 = { 3, 4, 5 };

		// System.out.println(Arrays.equals(num1, num2));

		if (Arrays.equals(num1, num2)) {
			System.out.println("Num1 and num2 are match");
		} else {
			System.out.println("Mistmached values");
		}

		String[] strArr1 = { "one", "two", "three", "four" };
		String[] strArr2 = { "one", "two", "three", "four" };

		System.out.println(Arrays.equals(strArr1, strArr2));
		boolean match = Arrays.equals(strArr1, strArr2);
		System.out.println(match);
	
	
	
	
	
	
	}
	

}
