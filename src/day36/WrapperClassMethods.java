package day36;

public class WrapperClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//byte	
System.out.println();
System.out.println(Byte.MIN_VALUE);
System.out.println(Byte.MAX_VALUE);

//short
System.out.println();
System.out.println(Short.MIN_VALUE);
System.out.println(Short.MAX_VALUE);

//int
System.out.println();
System.out.println(Integer.MIN_VALUE);
System.out.println(Integer.MAX_VALUE);

//long
System.out.println();
System.out.println(Long.MIN_VALUE);
System.out.println(Long.MAX_VALUE);

//float
System.out.println();
System.out.println(Float.MIN_VALUE);
System.out.println(Float.MAX_VALUE);
//double
System.out.println();
System.out.println(Double.MIN_VALUE);
System.out.println(Double.MAX_VALUE);

 //char
System.out.println(Character.MIN_VALUE);
System.out.println(Character.MAX_VALUE);

//convert String to int
int count=Integer.parseInt("232322");
System.out.println("Count: "+count);
int count2=Integer.valueOf("122121");
System.out.println("Count2: "+count2);


System.out.println(Character.isAlphabetic('a'));
System.out.println(Character.isAlphabetic('1'));
System.out.println(Character.isAlphabetic('@'));
System.out.println(Character.isLetter('c'));
String str="java101";
System.out.println(Character.isAlphabetic(str.charAt(0)));
System.out.println(Character.isDigit(str.charAt(6)));
String word="asab12121hjdfjs";
for(int i=0;i<word.length();i++) {
	if(Character.isDigit(word.charAt(i))) {
		System.out.println(word.charAt(i));
	}
}


	}

}
