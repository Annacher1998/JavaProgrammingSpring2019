package day52;
import java.util.*;
public class FinalArrayList {

	
	
	final public static String COLOR="Pink";
	/*
	 * public is access modifiers
	 * final,static ->non-access modifier;
	 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		final ArrayList<String> colors=new ArrayList<>();
		colors.add("blue");
		colors.add("orange");
		colors.add("white");
		colors.add("pink");
		System.out.println(colors.toString());
		colors.add("black");
		colors.add("red");
		
		System.out.println(colors.toString());
		/*
		// you cannot create new object
		colors=new ArrayList<>();
		System.out.println(colors.toString());
		colors.add("yellow");
		
		*/
	}

}
