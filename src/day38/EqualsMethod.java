package day38;
import java.util.*;
public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> friends1=new ArrayList<>();
		List<String> friends2=new ArrayList<>();
		
		
		friends1.add("Roman");
		friends1.add("Orhan");
		friends1.add("Elizabeth");
		friends1.add("Natalia");
		
		
		friends2.add("Roman");
		friends2.add("Orhan");
		friends2.add("Elizabeth");
		friends2.add("Natalia");
		System.out.println(friends1);
		System.out.println(friends2);
		if(friends1.equals(friends2)) {
			System.out.println("Yes , friends1 same with friends2");
		}else {
			System.out.println("No, there no same");
		}
	
	}

}
