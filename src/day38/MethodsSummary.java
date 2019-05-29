package day38;
import java.util.*;
public class MethodsSummary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list1=new ArrayList<>();
		list1.add("red");
		list1.add("blue");
		list1.add("white");
		list1.add("grey");
		list1.add("black");
		// tostring methods to print all value in same line
		System.out.println(list1.toString());
		//add  method with index: "yellow will be placed to index 0
		list1.add(0,"yellow");
		System.out.println(list1);
		//size method
		System.out.println("Numbers of element: "+ list1.size());

		//get method
		System.out.println("And second possition from list is: "+list1.get(1));
		
		
		//remove
		list1.remove(0);
		System.out.println("Remove first value of list "+ list1);
		//remove using value, removes element from first occurence
		
		list1.remove("blue");
		System.out.println(list1.toString());
		
		//set method -replace certain index with new value
		list1.set(0, "pink");
		System.out.println(list1.toString());
		
		//indexOf some value .return index of value in list
		System.out.println("grey: "+ list1.indexOf("grey"));
		System.out.println("green: "+ list1.indexOf("green"));
		
		//isEmpty, returns true is list is empty, otherwise false
		System.out.println("IS list empty?-" + list1.isEmpty()) ;
		
		// contains
		System.out.println("Is list has grey? "+ list1.contains("grey"));
		
		List<String> list2=new ArrayList<>();
		
		//add all ->add all values from one list into  another
		list2.addAll(list1);
		System.out.println(list2);
		
		// containsAll
		System.out.println("ContainsAll: "+list1.containsAll(list2));
		
		//equals== checks if 2 lists are exactly equal
		System.out.println("equals: "+list2.equals(list1));
		// add
		list2.add("purple");
		// remove --all matches values from your list that are in other list
		list2.removeAll(list1);
		System.out.println("list2 : "+list2);
		System.out.println("list1: "+list1);
		
		////AddAll (index,list)add a new list values starting from index
		list2.addAll(0,list1);
		System.out.println("list2: "+ list2);
		
		// clear
		list1.clear();
		list2.clear();
		System.out.println("both empty: "+ (list1.isEmpty()&& list2.isEmpty()));
		
		
	}

}
