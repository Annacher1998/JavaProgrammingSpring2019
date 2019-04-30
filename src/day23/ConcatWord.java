package day23;
import java.util.Scanner;
public class ConcatWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
		String word="";
String sum="";

for(int i=0;i<6;i++) {
	System.out.println("please enter words");
	word=scan.nextLine();
	if(word.equals("java")) {
		continue;
	}
sum+=word+ " ,";

}
sum=sum.substring(0,sum.length()-2);
//sum=sum.substring(0,sum.lastIndexOf(","));
System.out.println("And sum :"+ sum);


	}

}
