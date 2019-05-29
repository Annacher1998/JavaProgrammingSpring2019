package day41;

public class BankAccount {
	
	
	double balance;
	String accountHolder;
	int accountNum;

	public void deposit(double amount) {
	System.out.println("#######################");
		System.out.println("depositing "+amount+" to "+ accountNum);
	balance+=amount;
	
	
	
	}
	public void withdraw(double amount) {
		System.out.println("#############################");
		System.out.println("withdrawing $ "+ amount+" from "+ accountHolder+" and account number is "+accountNum);
		
		balance-=amount;
		System.out.println("And your balance is "+ balance);
	    if(balance<0) {
	    	balance-=35;
		}
	    
	}
	
	
	public void showBalance(){
		System.out.println("################################");
		System.out.println("Account Holder "+accountHolder);
		System.out.println("Your balance $: "+ balance);
	
		}
	public void charge(double price,String item) {
		System.out.println("############################");
		if(balance>=price) {
		System.out.println("Buying " +item+" you will be charged "+price+" in couple second");
		balance-=price;
		System.out.println("Here's your balance: "+balance);
		System.out.println("Your item "+ item+" will be delivered in next couple bisness days");
		}else {
			System.out.println("You dont have that money, please make a deposit to increase your balance");
		}
	}
	}
