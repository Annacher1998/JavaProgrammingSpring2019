package day40;

public class Employee {
public String name;
public String jobTitle;
 double salary;


public void work() {
	System.out.println(name+" start working at 9.00am");
}

public void gotoBreak() {
	System.out.println("Break time from 1-2pm "+ name);
}
public void attendMeeting() {
	System.out.println(name+ " attending meeting every day");
	
	
}
public void introduce() {
	System.out.println("Name[" + name +"], jobTitle[" + jobTitle 
			+"], salary[" + salary + "]");
}

}
