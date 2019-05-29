package day40;
import java.util.*;
public class WarmupListCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String word="java";
		ArrayList<String> str=new ArrayList<>();
		str.add("java");
		str.add("java");
		str.add("phyton");
		str.add("c++");
		str.add("script");
		
	int count=(countOccurances(str,word));
System.out.println(count);
	}

	public static int countOccurances(ArrayList<String> str,String word) {
		
		//methods count how many times , word appears in the list and returns count
		
		int count=0;
		for(int i=0;i<str.size();i++) {
			if(str.get(i).equals(word)) {
				count++;
			}	
		}
		return count;	
	
	
	}
	
	
}
