package day39;
import java.util.*;
public class CitiesArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> cities = new ArrayList<>();

		cities.add("Tokyo");
		cities.add("New York");
		cities.add(0, "Paris");
		cities.add("Pittsburgh");
		cities.add(1, "Berlin");
		cities.add("Madrid");
		cities.add("Moscow");
		cities.add("Istanbul");
		cities.add("Washington D.C.");
		cities.add("Amsterdam");
		cities.add("Zurich");
		cities.add("Singapore");
		cities.add("Milan");
		cities.add("Toronto");
		cities.add("London");
		cities.add("Lima");

		// print each city separated by |
		for (String city : cities) {
			System.out.print(city + "|");
		}
		System.out.println();
		for (int i = 0; i < cities.size(); i++) {
			System.out.print(cities.get(i) + "|");
		}
//    //print each city all uppercase
//    System.out.println();
//    for(String city2:cities) {
//    	System.out.print(city2.toUpperCase()+"|");
//    	
//    }
		// to upper case using toString
		System.out.println();
		System.out.print(cities.toString().toUpperCase());

		// make each city all uppercase
		System.out.println();
		String paris = cities.get(0).toUpperCase();
		cities.set(0, paris);
		cities.set(1, cities.get(1).toUpperCase());
		
		for(int j=0;j<cities.size();j++) {
			String city=cities.get(j).toUpperCase();
			cities.set(j,city);
		}
		System.out.println(cities.toString());
		
//find the longest city
		String longest="";
		String shortest="";
		for(int m=0;m<cities.size();m++) {
			if(shortest.length()<cities.size()) {
				shortest=cities.get(m);
			}
			if(longest.length()<shortest.length()) {
				longest=cities.get(m);
			}
		}
		System.out.println("Longest city: "+longest);
		System.out.println("Shortest city: "+ shortest);
		
		ArrayList<String> citiesMore6=new ArrayList<>();
		//assign all cities that have more than 6 character to this arrayList
		for(String city:cities) {
			if(city.length()>6) {
				citiesMore6.add(city);
			}	
		}
		System.out.println("Cities more than 6 characters: "+ citiesMore6);

		
		
	}
}