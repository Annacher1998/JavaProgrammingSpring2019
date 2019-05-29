package day48;

public class Student extends Person {


	int studentId;
	String subject;
	
	public void code(String language) {
		System.out.println(name+" is coding "+ language+" language");
	}
	public void attendClass() {
		System.out.println(name+" is attending "+ subject+" class");
	}

}
