package day23;
import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner scan=new Scanner(System.in);
		
		//num not divided  by 5 until 30;
		
		for(int i=1;i<50;i++) {
			
			if((i%5==0)&& (i%30!=0)) {
				continue;
			}
			if(i%30==0) {
				break;
			}
			System.out.print(i+",");
		}
		
		
		
		
		
	}

}
