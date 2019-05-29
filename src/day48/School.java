package day48;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person p1=new Person();
		Student s1=new Student();
		
		p1.name="Obama";
		p1.age=57;
		p1.gender='M';
		 
		
		s1.name="Anna";
		s1.gender='F';
		s1.age=20;
		
		
		p1.eat("avocado toast");
		s1.eat("pizza");
		//#############
		p1.sleep(6);
		s1.sleep(9);
		//?#############
		p1.walk();
		s1.walk();
		
		
		//##########
		Student s2=new Student();
		s2.name="Alina";
		s2.age=20;
		s2.gender='F';
		s2.subject="Agile";
		s2.studentId=2323232;
		s2.code("java");
		s2.attendClass();
		s1.code("phyton");
		
	
		
	}

}
