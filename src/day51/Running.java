package day51;

public class Running extends Exercise {

	@Override
	public int perform(int minutes) {
		//System.out.println("Doing  running exercise");
		int cal;

		cal= 10*minutes;
		System.out.println("Doing running for "+minutes+" minutes you're burning "+ cal+" cal");
		return cal;
	}
	
	
	
}
