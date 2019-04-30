package day34;

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
add("one","two");
	}
public static void add(int num1,int num2) {
	int result=num1+num2;
	System.out.println("Int Result "+result);
}
public static void add(double d1,double d2) {
	double result=d1+d2;
	System.out.println("Double Result "+result);
}
public static void add(String str1,String str2) {
	String result=str1+" "+str2;
	System.out.println("String Result "+result);
}
}
