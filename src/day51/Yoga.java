package day51;

public class Yoga extends Exercise {
	
	
	
	@Override
	public int perform(int minutes) {
		//System.out.println("Doing yoga exercise");
		int cal;

		cal= 5*minutes;
		System.out.println("Doing yoga for "+minutes+" you're burning "+ cal+" cal");
		return cal;
	}
}
