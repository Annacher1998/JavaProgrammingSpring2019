package day16;
import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter some word(s):");
		String words=scan.nextLine();
		
		System.out.println(words.replace("o","a"));
		
		
		System.out.println(words.replace("sad", "happy"));
		
		
	}

}
