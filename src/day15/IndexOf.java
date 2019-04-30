package day15;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String word1="github";
		System.out.println(word1.indexOf("t"));
		System.out.println(word1.indexOf("th"));
		System.out.println(word1.indexOf("hub"));
		System.out.println(word1.indexOf("java"));
		
		
		String url="www.okta.com";
		System.out.println("Position of . is "+ url.indexOf("."));
		
		System.out.println(url.charAt(url.indexOf(".")+1));
		
	
	String item="Java - Google Search";
	System.out.println("And position of 1st spase is "+item.indexOf(" "));
	System.out.println(item.charAt(item.indexOf(" ")-1)+""+item.charAt(item.indexOf(" ")+1));
	
	String country="United States of America";
	int states=country.indexOf("States");
	System.out.println("Position of states is "+states);
	
	String word2="java, c++, python,tomcat,eclipse";
//1) using contains
	if (word2.contains("c++")){
	System.out.println("c ++ is there");
}else {
	System.out.println("c++ is not there");
}
	//2)using indexOf
	
	System.out.println("Position of c++ is "+word2.indexOf("c++"));
	System.out.println("Yes c++ is there: "+ word2.charAt(word2.indexOf("c++"))+""+word2.charAt(word2.indexOf("c++")+1)+""+word2.charAt(word2.indexOf("c++")+2));

	/*
	if (word2.indexOf("c++")>-1) {
		System.out.println("c++ is there");
	}else {
		System.out.println("c++ is not there");
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	
	
	}

}
