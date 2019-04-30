package day31;
import java.util.*;
public class Authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
login("mentoring@cybertekschool.com","mentor001");
	}

	
	
	
	public static void login(String userName,String password) {
		String validUserName="mentoring@cybertekschool.com";
		String validPassword="mentor001";
	if(userName.equals(validUserName)&&password.equals(validPassword)) {
		System.out.println("Login Successful! Welcome to Okta!");
	}else {
		System.out.println("Sign in failed!");
	}
		
		
	}
}
