package day52;

public class FinalMethods {

	public  final void method1() {
		// TODO Auto-generated method stub

		System.out.println("Final method 1");
		
		
	}

}

class sub extends FinalMethods {
	//cannot override since it is a final method
	/*
	@Override
	public  void method1(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Override method 1");
		
		
	}
	*/
	
	public  final void method1(String str) {
		// TODO Auto-generated method stub

		System.out.println("Overloading method 1"+ str);
		
		
	}
	
	public final static void staticMethod(String word) {
		System.out.println("staticMethod: "+word);
	}
	
	
	
	
	
	
}
