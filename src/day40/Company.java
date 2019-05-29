package day40;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee anna=new Employee();
		anna.jobTitle="SDET";
		anna.name="Anna";
		anna.salary=100000.00;
		
		System.out.println("####AMAZON COMPANY EMPLOYEE LIST####");
		System.out.println("Name of employee: "+ anna.name);
		System.out.println("Job Title: "+anna.jobTitle);
		System.out.println("Salary: "+anna.salary);
		
		anna.introduce();
		anna.attendMeeting();
		anna.gotoBreak();
		anna.work();
		anna.jobTitle="Developer";
		anna.salary=130000;
		anna.introduce();
		
	}

}
