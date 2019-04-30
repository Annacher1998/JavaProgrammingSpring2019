package day21;
import java.util.Scanner;
public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("How many item do you want purchase?");
		int numberItem = scan.nextInt();
		double price = 0.0;
		String item = "";
		for (int count = 1; count <= numberItem; count++) {

			System.out.println("What is item number " + count + " ?");
			String itemName = scan.next();
			item += itemName + ",";
			System.out.println("How much " + itemName + " cost?");
			double Itemprice = scan.nextDouble();
			price += Itemprice;

		}
		
		System.out.println("Your items: " + item);
		System.out.println("Total Price is: " + price);
		
	}

}
