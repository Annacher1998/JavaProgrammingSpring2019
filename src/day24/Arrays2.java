package day24;

public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// print characters one by one if characters is equals to 'o'replace with '*'
		String str="Wooden spoon";
		
		char[] letters=str.toCharArray();
		for(char a:letters) {
		if(a=='o') {
			System.out.println("*");
		}else {
			System.out.println(a);
		}
		}
		
		
		
		
	}

	

	
	}


