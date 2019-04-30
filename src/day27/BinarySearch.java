package day27;
import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int nums[]= {2,3,4,6,9,13};
		Arrays.binarySearch(nums, 4);
		System.out.println(Arrays.binarySearch(nums, 4));// index 2;
		System.out.println(Arrays.binarySearch(nums, 13));
		System.out.println(Arrays.binarySearch(nums, 1));// index -1 
		int num=Arrays.binarySearch(nums,9);
		System.out.println(num);//4
		int nums2[]= {2,34,4,56,9,13};
		Arrays.sort(nums2);
		System.out.println(Arrays.toString(nums2));
	
		System.out.println(Arrays.binarySearch(nums2,34));// 4

		/// 
		
		
		
	}

}
