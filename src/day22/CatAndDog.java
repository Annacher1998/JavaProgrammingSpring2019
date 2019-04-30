package day22;

public class CatAndDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="mycatyourcat";
int counter=0;
for(int i=0;i<str.length()-2;i++) {
	String temp=str.substring(i,i+3);
	
	if(temp.equals("cat")) {
		counter++;	
	}
		
}
System.out.println(counter);
	}

}
