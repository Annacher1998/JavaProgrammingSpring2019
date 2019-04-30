package day32;

import java.util.Arrays;

public class ArrayParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = { 23, 4, 5, 3, 2, 1, 9 };
		printArray(myArray);

		printArray(new int[] { 23, 45, 3, 2, 1 });

		int[] myNums = (new int[] { 2, 3, 5, 88, 9, 99 });
		printArray(myNums);
		int[] nums1= {23,45,23,11,1,2,2};
		int[] nums2= {2,2,3,5,2,1};
		print2Arrays(nums1,nums2);
		print2ArrayV2(nums1,nums2);
	}

	public static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
public static void print2Arrays(int[]nums1,int[]nums2) {
	//it prints the larger array 
	if(nums1.length>nums2.length) {
		System.out.println(Arrays.toString(nums1)+" bigger than "+Arrays.toString(nums2));
	}else {
		System.out.println(Arrays.toString(nums2)+" bigger than "+Arrays.toString(nums1));
	}
}
public static void print2ArrayV2(int[] nums1,int[]nums2) {
	if(nums1.length>nums2.length) {
		printArray(nums1);
		printArray(nums2);
	}else {
		
	}
		printArray(nums2);
		printArray(nums1);
	
}
}
