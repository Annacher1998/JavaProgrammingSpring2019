package day41;

public class CapitolOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount card=new BankAccount();
		card.accountHolder="Anna Chernyshova";
		card.accountNum=1232456566;
		card.balance=1000.00;
		card.deposit(120);
		card.showBalance();
		card.withdraw(300);
		card.charge(120, "Prada glasses");
		
		
		
	}

}
