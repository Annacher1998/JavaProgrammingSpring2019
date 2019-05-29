package day50;

public class AppsFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		IphoneApp iphone=new IphoneApp();
		IphoneApp iphone2=new IphoneApp("Shazam");
		
		AndroidApp android=new AndroidApp();
		AndroidApp android2=new AndroidApp("Yelp");
		
		
		System.out.println(iphone.getName());
		System.out.println(iphone2.getName());
		//////
		System.out.println(android.getName());
		System.out.println(android2.getName());
		
		App.count=33;
		System.out.println(IphoneApp.count);
		
		//////
		AndroidApp.count=100;
		System.out.println("App count: " +App.count);
		System.out.println("AndroidApp count: " +AndroidApp.count);
		System.out.println("IphoneApp count: " +IphoneApp.count);
		////
		
		App.build("Swift");
		App.build("Java");
		AndroidApp.build("Object C");
		IphoneApp.build("JS");
		
		
		
		
		
	}
	
	

}
