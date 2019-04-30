package day4_primitives_operators;

public class UsingVariables {
public static void main( String[] args) {
	
// declare num1.num2,num3
	int num1, num2, num3;
	// asign 100 to num1
	num1 = 100;
	num2 = num1;
	System.out.println(num1);
	System.out.println(num2);
	num2=200;
	num1=num2;
	num3=num1;
	System.out.println(num2);
	System.out.println(num1);
	System.out.println(num3);
	// declare apples and assign 25
	//declare kiwis and assign value of apples to it
	// mangos and assign 55
	// asssign mangoes to kiwis
	int apples;
	apples = 25;
	System.out.println(apples);
	
	int kiwi;
	kiwi=apples;
	System.out.println(kiwi);
	int mango;
	mango = 55;
	System.out.println(mango);
	kiwi=mango;
	System.out.println(kiwi);
	
			
	
	

}
}