package day36;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//declare arraylIst called languages
		ArrayList<String> languages=new ArrayList<>();
		languages.add("russian");
		languages.add("java");
		languages.add("english");
		languages.add("spanish");
		languages.add("french");
		languages.add("ukrainian");
		System.out.println("Languages number: "+ languages.size());
		languages.remove(0);
		System.out.println("Languages number: "+ languages.size());
		System.out.println(languages.toString());
		
	}

}
