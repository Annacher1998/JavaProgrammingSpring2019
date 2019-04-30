package day15;

public class StartsEndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word1="eclipse";
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ecl"));
		System.out.println(word1.startsWith("Ec"));// false
		
		System.out.println(word1.endsWith("se"));
		System.out.println(word1.endsWith("lipse"));
		System.out.println(word1.toUpperCase().endsWith("PSE"));// true
		

	
	// When 100% match for whole word it will be true
		// Mr.==>male
		//Mrs.==> married woman
		// Ms.==> single lady
		// Dr. doctor
		//==> uknown status
		String word2="Mr.Jackson";
		if(word2.startsWith("Mr.")) {
			System.out.println("Male");
		}else if(word2.startsWith("Mrs.")) {
			System.out.println("married woman");
		}else if(word2.startsWith("Ms.")) {
			System.out.println("single lady");
		}else if(word2.startsWith("Dr.")) {
			System.out.println("doctor");
		}else {
			System.out.println("Uknown status");
		}
		
	
	}

}
