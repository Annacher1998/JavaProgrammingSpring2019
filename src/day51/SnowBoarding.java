package day51;

public class SnowBoarding  extends Exercise{

	
	
	public int permorm(int minutes) {
		super.perform(50);//cal super class version of perform
		int cal;
		 cal= 7*minutes;
		
		System.out.println("Doing snowbording for "+minutes+" minutes you're burning "+ cal+" cal");
		return cal;
	}
	
	
	
}
