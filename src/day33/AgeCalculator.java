package day33;

public class AgeCalculator {
public static void main(String[] args) {
	int result=calculateAge(1918);

}
public static int calculateAge(int year) {
	
		int currentyear = 2019;

		int age = currentyear - year;

		System.out.println("your age is:"+age);
		if (age >= 1 && age <= 14) {
			System.out.println("child");

		} else if (age >= 15 && age <= 25) {
			System.out.println("youngster");
		} else if (age >= 26 && age <= 64) {
			System.out.println("adult");
		} else if (age >= 66) {
			System.out.println("senior");
		} else {
			System.out.println("Invalid age");
			
		}
		return age;

	
}

}
