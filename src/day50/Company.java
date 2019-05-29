package day50;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Employee em=new Employee();
		FullTimeEmployee full=new FullTimeEmployee();
		Contractor con=new Contractor ();
		
		
		em.calculatePay(40, 20);
		full.calculatePay(40, 40);
		con.calculatePay(40, 55);
	
		
		
		
	}

}
