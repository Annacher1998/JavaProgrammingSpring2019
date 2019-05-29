package day47;
import java.time.LocalDateTime;
import java.util.*;
public class briteERP {
	
	
	
	static {
		System.out.println("Launch browser");
		System.out.println("Navirate to: "+testData.url);
		
	}
	public static void enterEmail() {
		System.out.println("Enter email: "+testData.email);
		
	}
	public static void enterPassword() {
		System.out.println("Enter password: "+testData.password);
		
	}
	public static void verifyLogIn() {
		System.out.println("Excpected Name: "+testData.userName);
		System.out.println("Actual Name displayed");
		System.out.println("login successful"+LocalDateTime.now());
		
	}
}
