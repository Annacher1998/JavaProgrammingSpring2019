package day38;
import java.util.*;

public class RemoveAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> list1=new ArrayList<>();
		
		list1.add(12);
		list1.add(34);
		list1.add(78);
		
		List<Integer> list2=new ArrayList<>();
		list2.add(89);
		list2.add(63);
		list2.add(12);
		list2.add(78);
		list2.add(12);
		System.out.println(list1);
		System.out.println(list2);
		//remove all matches from list1
		 list2.removeAll(list1);		 
		 System.out.println(list2);
		//remove all matched frpm list2
		list1.removeAll(list2);
		System.out.println(list1);
		
	}

}
