package day11;
import java.util.Scanner;
public class logInTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scan=new Scanner( System.in);
		String validUsername = "cybertek@mail.com";
		String Validpassword= "WoodenSpoon123";
		String username, password ;
		//username=validUsername;
		System.out.println("Please enter your username and password");
		username=scan.nextLine();
		password=scan.nextLine();
		
		if ( username.equalsIgnoreCase(validUsername) && password.equals(Validpassword)) {
			System.out.println("Login Successful, Welcome");
		}
		else if (!username.equalsIgnoreCase(validUsername) && !password.equals(Validpassword)) {
			System.out.println("Invalid Username and Invalid Password");
		}
		else if ( username.equalsIgnoreCase(validUsername) && !password.equals(Validpassword)) {
			System.out.println("Invalid Password");
		}
		else if( !username.equalsIgnoreCase(validUsername) && password.equals(Validpassword)) {
			System.out.println("Invalid Username");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
