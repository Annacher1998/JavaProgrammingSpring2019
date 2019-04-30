package day27;

import java.util.Arrays;

public class CanvasCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String url="https://learn.cybertekschool.com/courses/144";
String[] ArrayUrl=url.split("/");
System.out.println(Arrays.toString(ArrayUrl));
	


// print last value
	String last=ArrayUrl[4];// ArrayUrl[ArrayUrl.length-1];
	
	
	// convert String to int
	int number=Integer.parseInt(last);
	
	// use switch case
	switch(number) {
	case 147:
		System.out.println("Java programming");
		break;
	case 204:
		System.out.println("Mentoring sessions");
		break;
	case 149:
		System.out.println("SDLC");
		break;
	case 152:
		System.out.println("QA Testing");
		break;
	case 144:
		System.out.println("Team activity");
		break;
	case 143:
		System.out.println("Welcome Kit");
		break;
		default:
			System.out.println("Invalid code");
	}
	
	
	}

}
