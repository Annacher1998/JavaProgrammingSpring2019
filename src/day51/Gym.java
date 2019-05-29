package day51;

public class Gym {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exercise ex=new Exercise();
		Running run=new Running();
		Yoga yoga=new Yoga();
		Swimming swim=new Swimming();
		JuiJitsu ju=new JuiJitsu();
		Sprinting sp=new Sprinting();
		
		ex.perform(30);
		run.perform(60);
		yoga.perform(40);
		swim.perform(30);
		ju.perform(10);
		sp.perform(30);
		System.out.println("==================");
		SnowBoarding snow=new SnowBoarding();
		snow.perform(100);
	}

}
