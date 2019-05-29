package day42;
import java.util.*;
public class ShoesShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Shoes str=new Shoes();
		str.setShoesData("Ecco", 8.5);
		//System.out.println(str.getShoesData());
		
		Shoes str2=new Shoes();
		str2.setShoesData("Aldo", 7.5);
		
		Shoes str3=new Shoes();
		str3.setShoesData("Hugo Boss", 4.5);
		
		
		
		Shoes[] shoesArray=new Shoes[3];
		shoesArray[0]=str;
		shoesArray[1]=str2;
		shoesArray[2]=str3;
		
		
		System.out.println(shoesArray[0].getShoesData());
		System.out.println(shoesArray[1].getShoesData());
		System.out.println(shoesArray[2].getShoesData());
		System.out.println(shoesArray[0].brand);
		System.out.println(shoesArray[1].brand);
		System.out.println(shoesArray[2].brand);
		//ArrayList of shoes
		ArrayList <Shoes> shoes=new ArrayList<>();
		shoes.add(str);
		shoes.add(str2);
		shoes.add(str3);
		System.out.println(shoes.get(0).getShoesData());
		System.out.println(shoes.get(1).getShoesData());
		System.out.println(shoes.get(2).getShoesData());
		//check size of each shoes
		System.out.println(shoes.get(0).size);
		System.out.println(shoes.get(1).size);
		System.out.println(shoes.get(2).size);
		
		
		Shoes redShoes=shoes.get(0);
		System.out.println(redShoes.getShoesData());
		
		//lets use for each loop and print data of each shoes
		System.out.println();
		for(Shoes shoe:shoes) {
			System.out.println(shoe.getShoesData());
		}
		//print name of shoes on the list if size>7
		System.out.println();
		System.out.println("Print shoes size>7");
		for(Shoes shoe1:shoes) {
			if(shoe1.size>7) {
				System.out.println(shoe1.getShoesData());
			}
		}
	}

}
