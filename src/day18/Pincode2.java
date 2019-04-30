package day18;
import java.util.Scanner;
public class Pincode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);

int secretCode=4321;
int pincode=0;
int attempts=0;

while(pincode!=secretCode && attempts<=3) {
	System.out.println("Please enter your pincode");
pincode=scan.nextInt();
attempts++;
if(attempts==3&&pincode!=secretCode) {
	System.out.println("Card is blocked");
	return;
}



}
System.out.println("Access grated, select operation");


	}

}
