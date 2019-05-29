package day36;
import java.util.ArrayList;
public class ArrayListIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str=new String[5];
		ArrayList<String> names = new ArrayList<>();
		int[] numsArray=new int[5];
		ArrayList<Integer> nums=new ArrayList<>();
		
		
		// assign values into arraysList
		names.add("Roman");
		names.add("Orhan");
		names.add("Vlad");
		names.add("Anna");
		names.add("Natalia");
		nums.add(100);
		nums.add(20);
		nums.add(34);
		
		// read from arrayList
		System.out.println(names.get(0));
		System.out.println(names.get(2));
		System.out.println("Names count : "+ names.size());
		System.out.println("Nums count: "+nums.size());
	}
	

}
