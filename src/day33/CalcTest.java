package day33;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(ReturnMethodsWithInt.add(12,2));
System.out.println(MultipleMethodReturn.multiply(12.2, 2));
System.out.println(MultipleMethodReturn.minus(12.2, 2));
System.out.println(MultipleMethodReturn.divide(50, 2));

int addResult=ReturnMethodsWithInt.add(33,2);
double mResult=MultipleMethodReturn.multiply(9, 2);
double miResult=MultipleMethodReturn.minus(8.3, 2);
double diResult=MultipleMethodReturn.divide(4.55, 1);
System.out.println("addResult: "+addResult);
System.out.println("mResult: "+mResult);
System.out.println("miResult: "+miResult);
System.out.println("diResult: "+diResult);

 double a=10.0,b=5.0;
double myResult=MultipleMethodReturn.minus(a,b);
System.out.println("MyResult: "+myResult);



double[] dNums= {2.0,4.0};
double result2=MultipleMethodReturn.multiply(dNums[0],dNums[1]);
System.out.println("Result from array: "+result2);

if(ReturnMethodsWithInt.add(10,16)==26){
	System.out.println("Add Unit test passed");	
}else {
	System.out.println("Add Unit test failed");
}
	String str="java";
	if(str.length()==4) {
		System.out.println("It is 4 characters ");
	}else {
		System.out.println("It is not 4 characters");
	}
	
	
	
	}

	
	
	
	
}
