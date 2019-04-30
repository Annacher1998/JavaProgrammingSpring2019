package day20;
import java.util.*;
public class WhileLoop {

	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int inhabitants = scan.nextInt();
	    int days=0;
	      while(inhabitants>0){
	    	 
	    	  System.out.println("Day "+days+ " ["+inhabitants+"]");
	    	 inhabitants = inhabitants/2;
	    	 days++;
	      
	      }	      
	      System.out.println("---- EXTINCT ----");
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      }
}