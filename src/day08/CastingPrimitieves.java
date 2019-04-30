package day08;

public class CastingPrimitieves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// cast double value to int 
		int i = (int)3.4; /// print whole number
		System.out.println("i: "+ i);
		double price = 230.50;
		int dollars  = (int)price;
		System.out.println("dollars : "+ dollars);
		System.out.println("Price :"+ price);
		
	// whole numbers : byte , short , int
		int count =44;
		byte byteCount = (byte)count;
		System.out.println("ByteCode is : "+ byteCount);
	long longValue = 2334334L;
	int intValue = (int)longValue;
	System.out.println("IntValue is : "+ intValue);
	int large = 5757;
	short small = (short)large;
	System.out.println("small: "+small);
	
	int result = (int)(500.4 / 2.0);
	System.out.println("result :"+ result);
	}
	
	
	

}
