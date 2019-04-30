package day24;

import java.util.Arrays;

public class CarShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// BMW, Audi,Honda , Mercedes, Tesla, Mercury,Toyota//
		//1. create array of strings on store these cars inside thats arrays
		
		String[] cars= {"BMW", "Audi","Honda" , "Mercedes", "Tesla", "Mercury","Toyota", "Honda"};
		
				// print cars starts with m
		for(String car:cars) {
			if(car.startsWith("M")) {
				System.out.println(car);
				
			}
		}
		// print all cars that contains letter 'r' in the name , make case insensetive
		
		System.out.println("**********************");
		
		for(String letter:cars) {
			if(letter.toLowerCase().contains("r")) {
				System.out.println(letter);
			}
		}
		
		System.out.println("**********************");
		
		// print cars name that ends with a
		
		for(String end:cars) {
			if(end.endsWith("a")) {
				System.out.println(end);
			}
		}
		System.out.println("**********************");
		
		// print all  cars that have at least 6 letters
		
		for(String cars1:cars) {
			if(cars1.length()>5) {
				System.out.println(cars1);
			}
		}
		System.out.println("**********************");
		
		// swap first and last value in the array
		    String tem=cars[0];
		  cars[0]=cars[cars.length-1];
		  cars[cars.length-1]=tem;
		
		System.out.println(Arrays.toString(cars));
		
		Arrays.sort(cars);
		System.out.println(Arrays.toString(cars));
		System.out.println("Position :"+ Arrays.binarySearch(cars,"Honda"));
		
	}

}
