package day13_ternary_String_Introduction;
import java.util.Scanner;
public class CarSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*American : ford, dodge,tesla, chevrolet;licoln;
		 * Average price=33000;
		 * Japanese : toyota,mitsubisi, hondo,Subaru;
		 *  Average price=32000;
		 * German: BMW, VW,Audi,Mercedes,Porsche;
		 *  Average price=55000;
		 * Italian:Alfa Romeo,Ferrari,Lamborghini, Fiat;
		 * Average price=85000;
		 * Korean: Kia, Hyundai,Daewoo;
		 * Average price=25000;
		 */
		
		double averagePrice=0;
        String carOptions ;
		Scanner scan=new Scanner(System.in);
        System.out.println(" Please  pick your car type number:");
		int carType=scan.nextInt();
         switch(carType) {
         case 1:
        	 carOptions ="American cars and your options are: Ford, Dodge,Tesla,Chevrolet,Licoln.";
        	averagePrice=33000.0;
        	System.out.println("You selected: "+ carOptions +" AveragePrice is : " + averagePrice);
        	break;
        	 
         case 2:
        	 carOptions ="Japanese cars and your options are:Toyota,Mitsubisi, Hondo,Subaru.";
        	averagePrice=32000.0;
        	System.out.println("You selected: "+ carOptions+" AveragePrice is : "+ averagePrice );
        	break;
         case 3:
        	 carOptions ="German cars and your options are: BMW, VW,Audi,Mercedes,Porsche.";
        	averagePrice=55000.0;
        	System.out.println("You selected: "+ carOptions+" AveragePrice is : "+ averagePrice );
        	break;
         case 4:
        	 carOptions ="Italian cars and your options are: Alfa Romeo,Ferrari,Lamborghini, Fiat.";
        	averagePrice=85000.0;
         System.out.println("You selected: "+ carOptions+" AveragePrice is : "+ averagePrice );
        	break;
         case 5:
        	 carOptions ="Korean cars and your options are: Kia, Hyundai,Daewoo.";
        	averagePrice=25000.0;
        	System.out.println("You selected: "+ carOptions+ " AveragePrice is : "+ averagePrice );
        	break;
         default:
        	 System.out.println("Computer type not available");
        	
         }
		
         
		
		
		
		
		
		
		
		
		
	}

}
