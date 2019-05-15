package day42;

import java.util.Arrays;

public class Burger7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Burger burger1=new Burger();
		burger1.name="Cow Boy";
		String[] str= {"onions","american cheese"," tomato","pickles","lettuce","b7 sause"};
		burger1.ingridients=str;
		
		System.out.println(burger1.name.toString());
		System.out.println(Arrays.toString(burger1.ingridients));
		System.out.println(burger1.ingridients[1]);
		System.out.println(burger1.ingridients[0]);
		//print all ingridient using loop
		for(String ing:burger1.ingridients) {
			System.out.print(ing+", ");
		}
	}

}
