package day38;
import java.util.*;
public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> list1=new ArrayList<>();
		list1.add("January");
		list1.add("February");
		list1.add("March");
		list1.add("April");
		list1.add("May");
		
		System.out.println(list1);
		ArrayList<String> list2=new ArrayList<>(list1);//copy all of values from list 1;
		//System.out.println(list2);
		list2.add("June");
		list2.add("July");
		list2.add("August");
		
		System.out.println(list2);
		System.out.println(list2.contains("January"));
		System.out.println(list2.contains("December"));
		System.out.println(list2.contains("June"));
		//how would you check is february on 2 positions
		System.out.println(list2.indexOf("February")==1);
		System.out.println(list2.get(1).equals("February"));
		
		ArrayList<String> list3=new ArrayList<>(list1);
		System.out.println("Month: "+ list2.toString());
		System.out.println("Month: "+ list3.toString());
		//check if list2 has all values of list 3
		if(list2.containsAll(list3)) {
			System.out.println("True, list2 contains all value of list3");
		}else {
			System.out.println("No, something is missed");
		}
		
		
		//add one more jan to list3
		list3.add("January");
		if(list2.containsAll(list3)) {
			System.out.println("True, list2 contains all value of list3");
		}else {
			System.out.println("No, something is missed");
		}
		
	}

}
