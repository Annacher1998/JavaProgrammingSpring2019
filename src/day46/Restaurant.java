package day46;

public class Restaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dinner mom=new Dinner();
		Dinner dad=new Dinner();
		Dinner kid=new Dinner();
System.out.println("Number of slices before eating: "+Dinner.pizzaSlices);
dad.takeSlice();
kid.takeSlice();
mom.takeSlice();
System.out.println("Number of slices after taking one of each : "+Dinner.pizzaSlices);
System.out.println("Total slices: "+ dad.pizzaSlices);
kid.takeSlice(3);
dad.takeSlice(2);
//mom.takeSlice();
System.out.println("Total slices: "+Dinner.pizzaSlices);
		
		
	}

}
