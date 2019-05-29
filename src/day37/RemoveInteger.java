package day37;

import java.util.ArrayList;

public class RemoveInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> nums=new ArrayList<>();
nums.add(4);
nums.add(34);
nums.add(56);
nums.add(6);
nums.add(89);
nums.add(100);
nums.add(33);

System.out.println(nums.toString());
nums.remove(5);
System.out.println(nums.toString());

Integer n1=new Integer(4);
Integer n2=Integer.valueOf(4);
nums.remove(n1);
nums.remove(new Integer(33));
System.out.println(nums.toString());

	}

}
