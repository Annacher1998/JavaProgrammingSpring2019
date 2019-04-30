package day28;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FastFoodRestaurant {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		//read all data and assign to String array
		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
	
		System.out.println("Data size: "+data.length);
		//print first row
		System.out.println(data[0]);
		System.out.println(data[data.length-1]);
		
		/*
		//print each restaurant info in separate lines
		int count=0;
		for(int i=0;i<data.length;i++) {
			
			System.out.println(count+":"+data[i]);
			count++;
		}
		*/
		int count=1;
		//print all restaurant info in va
		for(int i=1;i<data.length;i++) {
			if(data[i].contains(",VA,")) {
				System.out.println(count+":"+data[i]);
				count++;
			}
		}
		//find all restaurant in va and print restautrant names along with cities
		//subway-herdon
		System.out.println();
		for(String res:data) {
			if(res.contains(",VA,")) {
				String[] resArray=res.split(",");
				System.out.println(resArray[2]+"-"+resArray[1]);
			}
		}
		
		
		
	}	
		
	}


