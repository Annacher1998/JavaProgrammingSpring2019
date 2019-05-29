package day52;

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Computer comp1=new Computer("IMac","silver");
		Computer comp2=new Computer("IMac","silver");
		Computer comp3=comp2;
		
		System.out.println(comp1==comp2);
		System.out.println(comp1.equals(comp2));
		
		System.out.println("################");
		System.out.println(comp3==comp2);
		System.out.println(comp3.equals(comp2));
		
		System.out.println("################");
		String str1="java";
		String str2=new String("java");
		
		//checking only if str1 and str2 point the same object
		System.out.println(str1==str2);//false
		
		//checking value in the str1 and str2
		//compares values not reference 
		System.out.println(str2.equals(str1));//true
	
	
	
	}
}
