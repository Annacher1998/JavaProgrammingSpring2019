package day16;
import java.util.Scanner;

public class Url {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Please give your website");
String url=scan.next();
// www.amazon.com
		if(url.startsWith("www.")) {
			System.out.println("Yes, it starts with www. ");
		}else {
			System.out.println("Error");
		return;
		}
		/* 
- check it contains the ending dot right before the extension
- assign String domain and 
String extension.
- print them
    "Domain:" amazon
    "Extension:" com 
*/
	
int url1=url.length()-4;
	if((url.charAt(url1))=='.') {
		System.out.println(". is there");
	}else {
		System.out.println(". may me miss");
	
	}
	String domain=url.substring(4,url1);
	String extension=url.substring(url1+1,url.length());
		System.out.println("And extension will be: "+extension);
		
		
		
		
	

	
	}

}
