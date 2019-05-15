package day37;

import java.util.ArrayList;
import java.util.Arrays;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> shoppingList=new ArrayList<>();
shoppingList.add("avocado");
shoppingList.add("cucumber");
shoppingList.add("chorizo");
shoppingList.add("tofu");
shoppingList.add("bread");
shoppingList.add("tomato");
//print number of items
System.out.println("Number of items: "+shoppingList.size());
//print all in singele line
System.out.println(shoppingList.toString());
//print first and last item
System.out.println("First item "+ shoppingList.get(0));
System.out.println("Last item : "+shoppingList.get(shoppingList.size()-1));

//remove 1st item from list
shoppingList.remove("avocado");
System.out.println(shoppingList.toString());
for(String item:shoppingList) {
	System.out.println(item);
	
}
//remove all items at once
	shoppingList.clear();
	System.out.println(shoppingList.toString());
	

	}

}
