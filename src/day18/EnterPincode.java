package day18;
import java.util.Scanner;
public class EnterPincode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int secretPin=1234;
int pincode=0;
while(pincode!=secretPin) {
	System.out.println("Enter pincode");
	pincode=scan.nextInt();
		
}
System.out.println("Access grated");




	}

}
