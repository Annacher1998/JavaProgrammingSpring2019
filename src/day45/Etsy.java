package day45;
import java.util.*;
public class Etsy {
private String email;
private String password;
private String firstName;

//constructor #1 
public Etsy() {
	System.out.println("No-args constructor");
	this.email="";
	this.password="";
	this.firstName="";
	
}
// constructor 2
public Etsy(String email,String firstName, String password) {
	 this.setEmail(email);
	this.setFirstName(firstName);
	 this.setPassword(password);
}
// constructor 3

public Etsy(String email,String firstName) {
	
	setEmail(email);
	setFirstName(firstName);
	
	this.password=getRandomPassword();

	
}
private String getRandomPassword() {
	Random ran=new Random();
	String letter="abcdefgijkmnlopqrstuvwxyz123456";
	String ranPassword="";
	for(int i=1;i<=6;i++) {
		ranPassword+=letter.charAt(ran.nextInt(letter.length()-1));
		
	}
	return ranPassword;
}

@Override
public String toString() {
	return "Etsy [email=" + email + ", password=" + password + ", firstName=" + firstName + "]";
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	
	
	if(email.indexOf("@")>0&& email.indexOf("@")!=email.length()-1) {
		this.email = email;
	}else {
		System.out.println("Please enter a valid email address");
	}
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	
	if(password.length()<6){
		System.out.println("error");
		this.password="";
	}else {
		this.password = password;
	}
}
public String getFirstName() {
	return firstName;

	
}
public void setFirstName(String firstName) {
	
	if(isValid(firstName)) {
		this.firstName = firstName;
	}else {
		System.out.println("Invalid name");
		this.firstName="invalid";
	}
	//cant be blank
		//needs to be only letters;
}
private boolean isValid(String firstName) {
	//check first if it is starts with or ends with space
	if(firstName.startsWith(" ")|| firstName.endsWith(" ")) {
		return false;
	}
	
	if(firstName.isEmpty()) {
		System.out.println("Cant be blank");
		return false;
	}
	
	for(int i=0;i<firstName.length();i++) {
		char ch=firstName.charAt(i);//one character at one time
		if(!Character.isAlphabetic(ch)&& ch!=' ') {
			return false;
		}
			
		
	}
	return true;
}


}
