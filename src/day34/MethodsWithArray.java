package day34;

import java.util.Arrays;

public class MethodsWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 3, 4, 5, 2, 6, 4, 2, 3, 4, 2 };
		int value = findOccurences(nums, 2);
		int five = findOccurences(nums, 5);
		// System.out.println(findOccurences(nums, value));
		if (five > 0) {
			System.out.println("5 value : " + five);
		} else {
			System.out.println("No 5s");
		}
		if (findOccurences(nums, value) > 0) {
			System.out.println("The value of 2 : " + value);
		} else {
			System.out.println("We dont have 2");
		}

		// create array and pass to method
		int twenty = findOccurences(new int[] { 21, 23, 10, 20, 20, 55, 22 }, 20);
		System.out.println("20 value is: " + twenty);

		// return int[] in getArray method
		System.out.println(Arrays.toString(getArray()));
	}

//METHOD FIND OCCURENCES////
	public static int findOccurences(int[] nums, int value) {
		int count = 0;
		for (int num1 : nums) {
			if (num1 == value) {
				count++;
			}
		}
		return count;
	}

	// METHOD GET ARRAY////
	public static int[] getArray() {

		int[] nums = { 2, 34, 4, 6, 4, 9 };

		return nums;
	}
	
	
	
	

}
