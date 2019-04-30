package day29;

import java.util.Arrays;

public class coutriesArrays2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//0		      1
/*USA	Washington DC    0
Canada	Ottawa           1
Mexico	Mexico city       2
Brasil	Brasilia           3
Peru	Lima                4
Argentina	Boanes Aeros    5
Bolivia	La Paz             6
Macedonia	Scopia         7
Kazakhstan	Nursultan      8
*/
		
		/*/String [][]countries=[9][2];
//countries[0][0]="USA";
//countries[0][1]="Washington DC";
//countries[1][0]="Canada";
//countries[1][1]="Ottawa";
		*/
		String[][] countries = new String[9][2];


		String[][] coutriesArray = { { "USA", "Washington DC" }, { "Canada", "Ottawa" }, { "Mexico", "Mexico city" },
				{ "Brasil", "Brasilia" }, { "Peru", "Lima" }, { "Argentina", "Boanes Aeros" }, { "Bolivia", "La Paz" },
				{ "Macedonia", "Scopia" }, { "Kazakhstann", "Nursultan" } };

		// print USA with capitol city
		
		System.out.println(coutriesArray[0][0]+"|"+coutriesArray[0][1]);//USA	Washington DC
		System.out.println(coutriesArray[8][0]+"|"+ coutriesArray[8][1]);// Kazakhstan	Nursultan
		System.out.println(Arrays.deepToString(coutriesArray));
		
		//print all the countries in same line separated by |
		for(int i=0;i<coutriesArray.length;i++) {
			System.out.println(coutriesArray[i][0]+"|");
		}
	
	// get all the cities and add to cities[] array
	//declare cities array and size needs to match countries Array size
	//null means "no object ". it is same as empty
		
		String[] city=new String[coutriesArray.length];
	
		for(int i=0;i<coutriesArray.length;i++) {
		city[i]=(coutriesArray[i][1]);//printing all cities
		
		} 
	System.out.println(Arrays.toString(city));
	// look for Bolivia in the countries array and test if capitol is la paz
	
	for(int row=0;row<coutriesArray.length;row++) {
		if(coutriesArray[row][0].equals("Bolivia")) {
			//System.out.println(coutriesArray[row][1]);
			if(coutriesArray[row][1].equals("La Paz")) {
				System.out.println("Bolivia pass test");
			}else {
				System.out.println("Bolivia test failed");
				
			}
			break;
		}
	}
	
	
	
	
	
	
	}

}
