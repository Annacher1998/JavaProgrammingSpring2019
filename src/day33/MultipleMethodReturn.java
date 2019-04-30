package day33;

public class MultipleMethodReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double total=multiply(12.2,3);
System.out.println("Multiple: "+total);
total=minus(12.9,8);
System.out.println("Minus: "+total);
total=divide(10,2.5);
System.out.println("Divide: "+total);
	}
public static double multiply(double num1,double num2) {
	double result=num1*num2;
	return result;
}
public static double minus(double num1,double num2) {
	double result=num1-num2;
	return result;
}
public static double divide(double num1,double num2) {
	if(num2==0) {
		System.out.println("ERROR,can not divide by 0");
		return 0;
	}else {
	double result=num1/num2;
	return result;
}
}


}
