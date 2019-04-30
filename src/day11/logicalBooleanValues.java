package day11;

public class logicalBooleanValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean b1=5>10 && 10>100;
		System.out.println("b1: "+b1);
		
		boolean b2 = 'a'=='a'&& 123>120;
		System.out.println("b2:"+b2 );
		
		
		
		boolean b3= true && 10>=10 && 1000<=900;
		System.out.println("b3:"+b3);
		
		boolean b4= false|| true &&10==10;
		System.out.println("b4:"+b4);
		
		boolean b5= false && true || 10==10;
		System.out.println("b5:"+b5);
		
		boolean b6= true && (true || 10!=10);
		System.out.println("b6:"+b6);
		
		boolean b7= false && true || 10!=10;
		System.out.println("b7:"+b7);
		
		boolean topicDone = true ;
		boolean isMoreThan3Pm= true;
		boolean everythingIsClear=true || false;
		
		
		boolean letsGoToTheBreak=topicDone&&isMoreThan3Pm&&everythingIsClear;
		System.out.println("lets go to the Break:"+letsGoToTheBreak );
		boolean b11 =true;
		System.out.println(!!b11);
		
		
		
		
		
		
		
		
		
		
		
	}

}
