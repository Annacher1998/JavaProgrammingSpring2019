package day46;

public class Ebay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cus1=new Customer("Abdallah Aleies", "AbdallahAleis@gmail.com");
		Customer cus2=new Customer("AdiletKyrgys", "AdiletKyrgys@yahoo.com");
		Customer cus3=new Customer("Anastasia Zasibna", "AnastasiaZasibna@outlook.com");



System.out.println("# of customer: "+cus3.count);
Customer cus4=new Customer("Anna Chernyshova", "AnnaChernyshova@outlook.com");
System.out.println("# of customer: "+cus4.count+" "+cus4.toString());


cus1.count=10;
System.out.println(cus4.count);
System.out.println(Customer.count);
	}

}
