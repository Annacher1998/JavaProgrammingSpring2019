package day51;

public class Swimming extends Exercise {
	
	
	
	
	@Override
	public int perform(int minutes) {
		//System.out.println("Doing swimming exercise");
		int cal;

		cal= 10*minutes;
		System.out.println("Doing swimming for "+minutes+" minutes you're burning "+ cal+" cal");
		return cal;
	}
}
