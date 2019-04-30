package day19;
import java.util.Scanner;
public class PrintLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		String word =scan.nextLine();
		
		int idx=0;
		
		
		while(idx<word.length()) {
			System.out.println( word.charAt(idx));
			idx++;
			
		}
		System.out.println();
		
		String word1="Amazon";
		
          int idx1=word1.length()-1;
		
		
		while(idx1>=0) {
			System.out.println(word1.charAt(idx1));
			idx1--;
			
		}
		
		
		
		
	}

}
