package day19;
import java.util.Scanner;
public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
		String word=scan.next();
int idx=word.length()-1;
String reverse="";
		while(idx>=0) {
reverse=reverse+word.charAt(idx);
idx--;

		}	
		System.out.println(reverse);
if (reverse.equalsIgnoreCase(word)) {
	System.out.println("Yes , it is palendrome");
}else {
	System.out.println("No, it is not palendorme");
}
	}

}
