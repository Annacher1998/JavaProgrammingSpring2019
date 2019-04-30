package day15;

public class indexOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// indexOf with 2 inputs
		String list="html-selenium-angular-jenkins-grid";
		int  firstDash=list.indexOf("-");
		
		System.out.println("first dash: "+firstDash);
		int secondDash=list.indexOf("-", 5);
		
		System.out.println("second dash is:" + secondDash);
		int thirdDash=list.indexOf("-" , 14);
		System.out.println(thirdDash);
		//int fourthDash=list.indexOf("-", 22);
		//System.out.println(fourthDash);
		
		int lastDash=list.lastIndexOf("-");
		System.out.println("Last dash is:"+lastDash);
		
		
		
		
		
		
		
		
		
		
	}

}
