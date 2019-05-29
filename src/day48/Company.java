package day48;

public class Company {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.name = "Marufjon";
		e1.jobTitle = "teacher/admin";
		e1.gender = 'M';
		e1.age = 32;

		Employee e2 = new Employee();
		e2.name = "Kiki";
		e2.age = 23;
		e2.gender = 'F';
		e2.jobTitle = "HR";

		e1.work();
		e2.work();

		e1.eat("chicken tacos");
		e2.eat("salad");

		e1.sleep(12);
		e2.sleep(8);

		e1.walk();
		e2.walk();
		///
		System.out.println(e2.toString());
		System.out.println(e1.toString());
	}
}
