package day35;

import java.util.Arrays;

public class PrintUniqueNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr= {1,2,2,4,3,1,4,5,6};
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]&&i!=j) {
					count++;
					break;
				}
				
			}
				if(count==0) {
				System.out.println(arr[i]+" ");
				
				
			}
		}
		int[] num= {7,4,1,4,1,5,9,9,3};
		uniqueNum(num);
System.out.println(Arrays.toString(getUniqueArray(num)));
		
	}
	//void method that accepts an array
	public static void uniqueNum(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			int count=0;
			for(int j=0;j<nums.length;j++) {
				if(nums[j]==nums[i]&&i!=j) {
					count++;
					break;
				}
				
			}
				if(count==0) {
				System.out.println(nums[i]+" ");
				
				
			}
	}

}
	//find out how many unique numbers
		//declare new array with that size
		//and loop through again and assign unique numbers
		//return the array
		public static int[] getUniqueArray(int[] nums) {
			//find out how many unique numbers
			int uniqueCount = 0;
			for(int i = 0; i < nums.length; i++) {//outer loop 
				
				int temp = nums[i]; // get a number
				int counter = 0;
				//
				for(int j = 0; j < nums.length; j++) {//inner/nested loop
					if(nums[j] == temp && i != j) {
						counter++;
						break;
					}
				}
				//
				if(counter == 0) {//is it still 0. then it is unique
					uniqueCount++;
				}	
			}
			//declare new array with that size
			int[] uniqueArray = new int[uniqueCount];
			int idx = 0;
			//and loop through again and assign unique numbers
			for(int i = 0; i < nums.length; i++) {//outer loop 
				
				int temp = nums[i]; // get a number
				int counter = 0;
				//
				for(int j = 0; j < nums.length; j++) {//inner/nested loop
					if(nums[j] == temp && i != j) {
						counter++;
						break;
					}
				}
				//
				if(counter == 0) {//is it still 0. then it is unique
					uniqueArray[idx] = temp;
					idx++;
				}	
			}
			
			//return the array
			return uniqueArray;
			
		}
	


		
		
		
		
	
		
}

