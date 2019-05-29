package day36;

public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		///AutoBoxing
		Integer num1=1234;
		int n=5;
		Integer num2=n;
		
		//UNBOXING=OBJECT->PRIMITEV
		Double d1=new Double (32.4);
		double d2=d1;
System.out.println("d1: "+d1);
System.out.println("d2: "+d2);
		
		
		long l1=new Long(500000);//unboxing
		Long l2=new Long(237637862L);//no boxing
		long l3=l2;//unboxing
		Long l4=l3;//ato-boxing
		Integer num3=Integer.valueOf(345);
		
		
	}

}
