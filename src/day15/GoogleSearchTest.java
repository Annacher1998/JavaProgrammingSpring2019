package day15;

public class GoogleSearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String item="java";
		String pageTitle=item+" - Google Search";
		// test if pageTitle starts with item;
		
		if(pageTitle.startsWith(item)) {
			System.out.println("Title check passed");
		}else {
			System.out.println("Error : Page title failed ");
		}
		if ( pageTitle.endsWith("Google Search")){
			System.out.println("Pass: Google search is in title");
		}else {
			System.out.println("Fail:");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
