package day24;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] cities={"Arlington", "Washington D.C." ,"  Kiev", "Annandel" , "Istanbul","Baku", "Miami","Malibu","Moscow"};
		System.out.println(cities.length);
		
		//print all cities that starts with M
		for(int i=0;i<cities.length;i++) {
			if(cities[i].startsWith("M")) {
				System.out.println(cities[i]);
			}
		}
		
		for(String city:cities) {
			if(city.startsWith("M")){
				System.out.println(city);
			}
		}
		
		
		
		
		
		
		
	}

}
