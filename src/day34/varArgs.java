package day34;
import java.util.*;
public class varArgs {

	public static void main(String... args) {
		
		//printWords method
		printWords("I", "love", "java");// 3 value
		printWords("grey");// 1 value
		printWords();// empty
		String[] myPets= {"cat","horse","dog","sheep"};
		printWords(myPets);
		//sum method
		System.out.println(sum(4,4,2,1,7,78));
		System.out.println(sum(4,4,2,1,7,78,23,24,2,1,1,21,1,3));
		int budget=200;
		if(sum(10,45,110,35,90)<=budget) {
			System.out.println("you are in budget");
		}else {
			System.out.println("you out of budget");
		}
		int total=sum(23,45,234,21,67,90);
		System.out.println("Total: "+total);
	
	cook("Avocado toast","avocado,toast,salt");
	
	shoppingList(1000,"Avocado toast","swatc watch","shoes","bag");
	}
	public static void printWords(String... words) {
		// handle it like an array
		for (String w : words) {
			System.out.println(w);
		}
	}

	public static int sum(int... nums) {
int sum=0;
for(int i=0;i<nums.length;i++) {
	
	sum+=nums[i];
}
return sum;
	}	
	public static void cook(String dish,String...ingridients) {
		System.out.println("~~~~~~~COOKING "+dish.toUpperCase()+ " RECIPE~~~~~");
		System.out.println("Ingridients "+Arrays.toString(ingridients));
		
	}
	public static void shoppingList(int totalPrice,String... items) {
		System.out.println("Total cost: " + totalPrice);
		System.out.println("Shopping list : "+Arrays.toString(items));
	}
}

