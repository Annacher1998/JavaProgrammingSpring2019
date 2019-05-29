package day38;
import java.util.*;

public class AddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l1=new ArrayList<>();
		l1.add("java");
		l1.add("python");
		List<String>l2=new ArrayList<>();
		l2.add("c#");
		l2.add("c++");
		
		System.out.println(l1);
		System.out.println(l2);
		l1.addAll(l2);
		System.out.println(l1);
		//adding one more time all value of l2
		l1.addAll(l2);
		System.out.println(l1);
		
	}

}
