package day08;

public class ExplicitCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(10/2.0);// result is double		
		System.out.println(10.0/2);
		int result = (int)(10/2.0);
		System.out.println("result:"+ result );
		
		        int rent1 = 987;
				int rent2 =1100;
				int rent3 = 898;
				int rent4 = 1234;
		
		double average =(rent1+rent2+rent3+rent4)/4;
		System.out.println("average: "+average);
				
		double average2 =(double)(rent1+rent2+rent3+rent4)/4;		
				
				System.out.println("average2:"+ average2);
				
				double d =  40.7;// explicit : double> byte 
				int i = (byte)d;
				System.out.println("i:"+ i);// implicit : byte> int
				
				
				
				
	}

}
