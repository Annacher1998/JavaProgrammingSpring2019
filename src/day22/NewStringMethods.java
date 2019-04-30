package day22;

public class NewStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=0;
		String sentence="He said hi,then she replied hi, hi guys";
		// check if temp=hi, if true increase add 1 to count;
		for(int i=0;i<sentence.length()-1;i++) {
		String temp=sentence.substring(i,i+2) ;
		
		//System.out.println(temp);
		
		if(temp.equals("hi")) {
			count++;
		}
		
		
		}
		System.out.println(count);
	}

}
