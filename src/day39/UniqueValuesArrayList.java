package day39;
import java.util.*;
public class UniqueValuesArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		// get unique values from arraylist
		
		List<Integer> nums=new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		nums.add(12);
		nums.add(20);
		nums.add(34);
		nums.add(10);
		nums.add(34);
		nums.add(3);
		nums.add(10);
		System.out.println(nums.toString());
		//find non-duplicated -unique words 
		List<Integer> unique=new ArrayList<>();
		//assign num to unique1 if nums is not already there
		for(Integer num:nums) {
			if(!unique.contains(num)) {
				unique.add(num);
			}
		}
		System.out.println(unique.toString());
		
		
		List<Integer> unique2=new ArrayList<>();
		for(int i=0;i<nums.size();i++) {
			int count=0;
			Integer value=nums.get(i);
			for(int j=0;j<nums.size();j++) {
				if(value==nums.get(j)&&i!=j) {
					count++;
					 break;
				}
			}
			if(count==0) {
				unique2.add(value);
			}
		}
		System.out.println(unique2.toString());
	}

}
