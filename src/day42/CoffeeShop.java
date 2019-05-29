package day42;
import java.util.*;
public class CoffeeShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//declare an array that can store to coffee object
		//String[] str =new String[3]
		//str[0]="java";
		Starbucks[] arr=new Starbucks[2];
		arr[0]=new Starbucks();
		arr[0].setCoffeeInfo("Espresso", "tall", 2.95, 7);
		arr[0].getCoffeeInfo();
		
		
		Starbucks latte=new Starbucks();
		latte.setCoffeeInfo("CAFE LATTE", "grande", 3.85, 190);
		
		arr[1]=latte;

		//print data from object in index 1
		arr[1].getCoffeeInfo();
		
	}

}
