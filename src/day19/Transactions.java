package day19;
import java.util.Scanner;
public class Transactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
double transaction=0;

System.out.println("Whats your current balance?");
double balance=scan.nextDouble();
double ammount=0;
	int min=5;	
while(balance>transaction) {
			System.out.println("Please enter your transaction");
		      transaction=scan.nextDouble();
		      balance-=transaction;
		      if(min<=balance) {
		      System.out.println("Be caryful in your card you have only:"+ balance);
		     

		      
		      }else {
		      System.out.println("Your card is blocked"+ balance);
		      }
		    	
		    	
		    
		}
		 System.out.println("And you current balance is:"+ balance+" if you want spend more, please insert money");
	}

	}
