package day06_operators2;

public class ShortHandOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int students = 45;
		students = students + 5;
		System.out.println(students);
		System.out.println("Students: "+ students );
		
		students = students - 2;
		System.out.println(students );

	 int teachers = 10;
	 System.out.println("Teachers: "+ teachers );
		
	teachers+=2;// teachers = teachers +2, increase teachers by 2.
	System.out.println(teachers);
	teachers-=5;//decrease teachers by 5.
	System.out.println(teachers);
	 int cars = 12;
	 cars = cars * 2;// cars *= 2;
	 System.out.println(cars);
	cars += cars;
			System.out.println(cars);
	int shoes =20;
	shoes /=4;
	System.out.println(shoes);
	//
	int minutes=66;
	minutes%=60;
	System.out.println(minutes);
	//
	int pennies = 550;
	pennies %= 100;
	System.out.println(pennies);
	
	
	
	
	
	
	
	
	
	
	
	}

}
