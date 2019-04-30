package day21;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String unique="";

		String word="javva";//aabbccdd
		
	 char ch=word.charAt(0);
if(!unique.contains(""+ ch))	{
	unique+=ch;
	
	
}
	if(unique.indexOf(ch)==-1) {// -1 means could not find it
		unique+=ch;
	}


System.out.println("Unique:"+unique);	
		
//-------------------------------------

		
		
		
		
	}

}
