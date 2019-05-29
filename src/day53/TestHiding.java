package day53;

public class TestHiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		City city=new City(5585,"London");
		Capitol cap=new Capitol(12121,"Amsterdam",1_000_000L);
		
		
		System.out.println(city.count);
		System.out.println(cap.count);
		
		System.out.println(city.toString());
		System.out.println(cap.toString());
		
		
		
		cap.displayCount();
		//call static method
		
		
		city.buildARoad();
		cap.buildARoad();
		/// calling from class
		City.buildARoad();
		Capitol.buildARoad();
		
		
		City city2=new City(444,"Donetsk");
		Capitol cap2=new Capitol(4222,"Kiev",1_000_999L);
		System.out.println("#####Calling non-static method using static method inside#####");
		city2.letsBuildRoad();
		cap2.letsBuildRoad();
	}
	
	

}
