package day45;

public class EtsyDotCom {

	public static void main(String[] args) {
		Etsy acct1 = new Etsy();
		System.out.println(acct1.toString());
		acct1.setEmail("pumev@mrmail.info");
		acct1.setFirstName("Pumev");
		acct1.setPassword("bulgaria123");
		
		System.out.println(acct1.toString());
		
		Etsy acct2 = new Etsy();
		acct2.setEmail("helirevaroyalhost.info");
		acct2.setFirstName("helireva123");
		acct2.setPassword("abc12");
		System.out.println(acct2.toString());
		
		Etsy acct3 = new Etsy("helireva@royalhost.info", 
				                      "Helireva", "royal234");
		System.out.println(acct3.toString());
		
		
		Etsy acct4=new Etsy("helireva@royalhost.info","Helireva");
		System.out.println(acct4.toString());
	}
}