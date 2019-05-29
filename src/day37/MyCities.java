package day37;
import java.util.*;
public class MyCities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> cities=new ArrayList<>();
		cities.add("Barnaul");
		cities.add("Nushambe");
		cities.add("Sterling");
		cities.add("Baku");
		cities.add("Astana");
		cities.add("Baku");
		//print each city using for each loop
		for(String city:cities) {
			System.out.println(city+" ");
		}
		//print each city using for loop
		System.out.println();
		for(int i=0;i<cities.size();i++) {
			System.out.println(cities.get(i)+" ");
		}
		cities.remove("Baku");
		System.out.println(cities.toString());
		
		//isEmpty?
		System.out.println("Is list empty ? "+cities.isEmpty());
		cities.add(0,"Donetsk");
		System.out.println(cities.toString());
		cities.add(1,"Kiev");
		System.out.println(cities.toString());
	
		
		//changing city for another city
		cities.set(2,"Miami");
		System.out.println(cities.toString());
		
		//find sterling in a list and give an index
		int bx=cities.indexOf("Sterling");
		System.out.println("Sterling index: "+bx);
		cities.set(4, "Odessa");
		System.out.println(cities.toString());
		 cities.clear();
		 boolean empty=cities.isEmpty();
		 System.out.println("Is it empty? "+empty);
	}

}
