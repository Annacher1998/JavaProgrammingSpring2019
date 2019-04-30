package day33;

public class ReturnMethodsWithInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int result=add(12,10);
System.out.println("Result: "+result);
addVoid(10,2);
	}
public static int add(int num1,int num2) {
	
	int sum=num1+num2;
	
	return sum;
	
	
	
}
public static void addVoid(int nums1,int nums2) {
	int sum=nums1+nums2;
	System.out.println("Sum: "+sum);
}
}
