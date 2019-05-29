package day37;
import java.util.*;
public class ArraysAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> nums=new ArrayList<>();
		List<String> cars=Arrays.asList("Honda","Tesla","Porshe","Lexus");
		System.out.println(cars.size());
		
		System.out.println(cars.toString());
		
		//create arraylist prices
		//assign values using Arrays.asList
		List<Double> prices =Arrays.asList(10.0, 34.7, 400.2, 3.4, 150.44, 6.7, 5.65, 8.7);
		System.out.println(prices.toString());
	double sum=0;
		for(int i=0;i<prices.size();i++) {
			sum+=prices.get(i);
		}
		System.out.println(sum+" ");
	
		//create new list expensive 
		//add prices that are more than 100
		
		List<Double> expensies=new ArrayList<>();
		for(double price:prices) {
			if(price>100.0) {
			expensies.add(price);
			}
			}
		System.out.println("Expensieve: "+expensies);
		
		
		
		
	}

}
