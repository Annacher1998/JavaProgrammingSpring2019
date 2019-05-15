package day38;
import java.util.*;
public class RawArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list  =new ArrayList();
		list.add("Saturday");
		list.add("Java day");
		list.add(12);
		list.add(12.9);
		list.add(true);
		list.add(false);
		System.out.println(list.toString()); //automatically call toString();
		
		
		String allValues=list.toString();
		System.out.println(allValues);
		String str=list.get(0).toString();
		System.out.println(str);
		//All value are stored as a raw type.We can also called General Object type
		Integer i=(Integer) list.get(2); // down casting 
		System.out.println(i);
		
	}

}
