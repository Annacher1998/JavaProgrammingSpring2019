package day51;

public class JuiJitsu extends Exercise{
	
	
	
	@Override
	public int perform(int minutes) {
		//System.out.println("Doing JuiJitsu exercise");
		int cal;

		cal= 12*minutes;
		System.out.println("Doing  JuiJitsu for "+minutes+" minutes you're burning "+ cal+" cal");
		return cal;
	}

}
