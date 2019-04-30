package day27;

import java.util.Arrays;

public class CopyOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// copy all the values from array and also add two more items
		int[] nums1= {23,45,239,43,34,98};
		int[] nums2=Arrays.copyOf(nums1, nums1.length+2);
		
		System.out.println(Arrays.toString(nums2));
		nums2[6]=22;
		nums2[7]=97;
		System.out.println(Arrays.toString(nums2));
		
		
		int[] num3=Arrays.copyOfRange(nums2, 2, 8);
		System.out.println(Arrays.toString(num3));
		
		
		int[] brandNew= {76,55,4,3,9};
		System.out.println("Length before :"+ brandNew.length);
		brandNew=Arrays.copyOf(brandNew, brandNew.length+5);
		System.out.println("Length after:"+ brandNew.length);
		
	}

}
