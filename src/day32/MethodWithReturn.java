package day32;

public class MethodWithReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(giveMe10$());
		int i=giveMe10$();
		System.out.println("i: "+i);
		
		System.out.println(giveMeYourName());
		String myName=giveMeYourName();
		System.out.println("myName is "+myName);
	}
	
	//this method ,returns int value
public static int giveMe10$() {
System.out.println("Returning 10 from method");
	return 10;
}
/*
 * giveMeYourName
 */
public static String giveMeYourName() {
	String name="Anna";
	
	return name; //return "Anna"
}



}
