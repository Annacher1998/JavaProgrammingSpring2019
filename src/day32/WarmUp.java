package day32;
import java.util.*;
public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		makePancakes();
		makePasta();
		cook("omlette","eggs,salt,tomatoes,scallions");
		
	}
	public static void makePancakes() {
		System.out.println("***PANCAKES RECIPE***");
		add("Milk,eggs,flour,sugar, salt");
		mix(120);
		fry(3);
		System.out.println("Enjoy your delicious pancakes");
	}
	public static void makePasta() {
		System.out.println("****ITALIAN PASTA RECIPE****");
		add("water,salt, olive oil");
		boil(2);
		add("spaghetti");
		boil(8);
		mix(60);
		add("parmesan cheese, marinara sause");
		System.out.println("***DELICIOUS PASTA IS READY****");
	}
	public static void cook(String dish,String ingridients) {
		System.out.println("~~~~"+ dish.toUpperCase()+" RECIPE~~~");
		add(ingridients);
		System.out.println("Cook it untill it is ready");
		System.out.println(" ~~~~ "+dish.toUpperCase()+" IS READY");
	}

public static void add(String ingridients) {
	
	System.out.println("Add "+ingridients);
	
	
}
/*
 * -> add something
    -> mix some seconds
    -> fry some minutes
    -> boil some minutes
   
 */
public static void mix(int seconds) {
	System.out.println("Now we are going to mix "+seconds+ " seconds");
}
public static void fry(int minutes) {
	System.out.println("Then you have to fry it for "+ minutes+ " minutes");
}
public static void boil(int minutes) {
	System.out.println("Start boiling for "+ minutes+ " minutes");
}
}
