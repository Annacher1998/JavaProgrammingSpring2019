package day43;

public class MicroCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer myComp = new Computer();

		Computer comp2 = new Computer();

		System.out.println(myComp.toString());
		System.out.println(comp2.toString());
		
		myComp.setBrand("MAC");
		myComp.setOS("IOS");
		myComp.setPrice(1700.00);
		
		comp2.setBrand("Dell");
		comp2.setOS("Windows 10");
		comp2.setPrice(1000);
		
		System.out.println(myComp.toString());
		
		System.out.println(comp2.toString());
		
		
		Computer comp3=new Computer("ASUS","Windows 7",600.34);
		System.out.println(comp3.toString());
	
		comp3.setOS("Windows 11");
		System.out.println(comp3.toString());
		
		
		comp3.setPrice(comp3.getPrice()-200.00);
		System.out.println(comp3.toString());
		
		
	}

}
