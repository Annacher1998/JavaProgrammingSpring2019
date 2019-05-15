package day40;

public class MyContact {

	public static void main(String[] args) {
		Contact anna=new Contact();
		anna.email="anna.chernyshova1998@gmail.com";
		anna.name="Anna Chernyshova";
		anna.phoneNumber=7033404177L;
		System.out.println("#####CONTACT LIST#####");
		System.out.println("Email: "+anna.email);
		System.out.println("Name: "+anna.name);
		System.out.println("PhoneNumber: "+anna.phoneNumber);
		anna.call();
		anna.sendMessage();
		anna.mail();
		
	Contact orhan=new Contact();
	orhan.email="orhan1212@gmail.com";
	orhan.name="Orhan";
	orhan.phoneNumber=378239742382L;
	 
	System.out.println("#####CONTACT LIST#####");
	System.out.println("Email: "+orhan.email);
	System.out.println("Name: "+orhan.name);
	System.out.println("PhoneNumber: "+orhan.phoneNumber);
	
	orhan.call();
	orhan.sendMessage();
	orhan.mail();
	
		
		
	}
}
