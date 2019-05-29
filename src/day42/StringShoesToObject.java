package day42;
import java.util.*;
public class StringShoesToObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		String data="Bruno Magli,9.5";
		//split using come, and storring to array
		String[] split = data.split(",");
		//create shoes object 
		Shoes str1=new Shoes();
		str1.brand=split[0];
		//converting string to double
		str1.size=Double.parseDouble(split[1]);
		str1.setShoesData(split[0], Double.parseDouble(split[1]));
		System.out.println(str1.getShoesData());
		
		//using scanner
		Scanner scan=new Scanner(System.in);
		System.out.println("What shoes brand ?");
		String brand=scan.next();
		System.out.println("What is your size");
		Double size=scan.nextDouble();
	//creating new object for scanner object
		Shoes str2=new Shoes();
		//storing scanner item in str2 object
		str2.brand=brand;
		str2.size=size;
		//storing scanner items in str2  using different way
		str2.setShoesData(brand, size);
		//print all values in object
		System.out.println(str2.getShoesData());
	}

}
