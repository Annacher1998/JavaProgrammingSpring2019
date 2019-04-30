package day18;

public class StairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String star="*";
		System.out.println(star);
		//1)with a counter	
		int num=1;
		while(num<=10) {
			System.out.println(star);
		star+="*";
		num++;
		}
//2)with a length

while(star.length()<=10) {
	System.out.println(star);
	star+="*";
	
}
		
		
		
		
		
		
		
		
	}

}
