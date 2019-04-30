package day16;

public class ExtraEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="hi";
		String result="";
		if(str.length()==2) {
			result=str+str+str;
			System.out.println(result);
		}else {
			result=str.substring(str.length()-2);
			System.out.println(result+result+result);
		
		
		}
		
		
		
		
		
		
		
		
		
		
	}

}
