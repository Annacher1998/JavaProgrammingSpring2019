package day38;
import java.util.*;
public class CollectionsSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> numsList=new ArrayList<>();
		numsList.add(44);
		numsList.add(1);
		numsList.add(2);
		numsList.add(99);
		numsList.add(1000);
		System.out.println(numsList);
		
		System.out.println("Sorting... please wait");
	    Collections.sort(numsList);
	    System.out.println("Sorted numbers : "+numsList);
	    
	    List<String> strList=new ArrayList<>();
	    strList.add("Anna");
	    strList.add("Alina");
	    strList.add("Roma");
	    strList.add("Burak");
	    strList.add("Gaziza");
	    System.out.println(strList);
	    System.out.println("Sorting... please wait");
	    Collections.sort(strList);
	    System.out.println("Sorted: "+ strList);
	    //Max and Min
	   int max= Collections.max(numsList);
	    int min=Collections.min(numsList);
	    System.out.println("Max number: "+max);
	    System.out.println("Min number: "+ min);
	   String maxName=Collections.max(strList);
	   String minName=Collections.min(strList);
	   System.out.println("max Name: "+maxName);
	   System.out.println("minName: "+ minName);
			   
	   // shuffle (RANDOM)
	   Collections.shuffle(strList);
	    System.out.println(strList);
	    
	}

}
