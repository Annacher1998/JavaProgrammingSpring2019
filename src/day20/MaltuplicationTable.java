package day20;
import java.util.Scanner;

public class MaltuplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter number:");
int num=scan.nextInt();

	if(num<1||num>10) {
		System.out.println("Invalid number!");
		return;
	}
for(int i=1; i<=10;i++) {
	int sum=num*i;
	System.out.println(num+" x "+ i+" = "+sum);
}
	}

}
