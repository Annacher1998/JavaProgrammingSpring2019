package day30;

public class StudentAtSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		study("Selenium");
		sleep(5);
	}
	
	
	public static void study(String topic) {
		System.out.println("Student studying "+topic);
		
	}
public static void sleep(int hours) {
	System.out.println("Student has been sleeping for "+ hours+" hours");
}
	

}
