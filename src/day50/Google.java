package day50;

public class Google extends SearchEngine{

	@Override
	public int search(String item) {
		System.out.println("Google searching for :"+ item);
		int resultsCount=item.length();
		return resultsCount;
	}
	//can be also protected
	public void search(String item,String item2) {
		System.out.println("Google searching for 2 items :"+ item+" ,"+ item2);
		int resultsCount=item.length()+item2.length();
		System.out.println("Total count "+resultsCount);
		
	}
	
	//default , protected
	public  String clickResult() {
		System.out.println("Clicking result ");
		return "Search result page...";
	}
}
