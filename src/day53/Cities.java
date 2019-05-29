package day53;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		City baku=new City(123,"Baku");
		System.out.println(baku.toString());
		
		
		City astana=new City(345,"Astana");
		System.out.println(astana);
		City anotherCity=new City(345,"Astana");
		
		
		
		if(astana.equals(anotherCity)) {
			System.out.println("Both are equal");
		}else {
			System.out.println("Does not equal");
		}
		
		
		System.out.println(baku.hashCode());
		System.out.println(astana.hashCode());
		System.out.println(anotherCity.hashCode());
		
		
		Capitol cap=new Capitol(1233,"Washington DC",9_000_000L);
	System.out.println(cap.toString());
	}

}
