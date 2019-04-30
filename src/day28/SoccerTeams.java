package day28;

import java.util.Arrays;

public class SoccerTeams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declare multiple array with 2 rows and 6 columns
		String[][] teams=new String[2][6];
		teams[0][0]="Irina";
		teams[0][1]="Zarif";
		teams[0][2]="Cihan";
		teams[0][3]="Habib";
		teams[0][4]="Adel";
		teams[0][5]="Bojan";
		
		teams[1][0]="Olimjon";
		teams[1][1]="Mirshod";
		teams[1][2]="Usman";
		teams[1][3]="Nursultan";
		teams[1][4]="Roman";
		teams[1][5]="Dmitriy";
		System.out.println("first player of first team:");
		System.out.println(teams[0][0]);
		System.out.println(teams[0][3]);//habib
		System.out.println(teams[1][5]);//dmitriy
		
		//print how many rows/teams / arrays
		System.out.println("Number of rows: "+teams.length);
		System.out.println("Number of people in first team: "+teams[0].length);
		System.out.println("Number of people in second team: "+teams[1].length);
		System.out.println(Arrays.deepToString(teams));
		
		
		
		
		int[][]states=new int[3][4];
		states[0][0]=100;
		states[0][1]=500;
		states[0][2]=1234;
		states[0][3]=5434;
		
		states[1][0]=54544;
		states[1][1]=23432;
		states[1][2]=67237;
		states[1][3]=5006;
		
		states[2][0]=23232;
		states[2][1]=287;
		states[2][2]=232;
		states[2][3]=7232;
		
		
		System.out.println(Arrays.deepToString(states));
	System.out.println(Arrays.toString(states[0]));
	int[] [] scores= { {3,5,10},{4,5,2,10} };
	System.out.println("Days played /Number of arrays: "+scores.length);
	System.out.println("Number of values in 1: "+scores[0].length);
	System.out.println("Number of values in 2: "+scores[1].length);
	
	
	int[][] values=new int[4][];
	values[0]= new int[] {32,43,23};
	values[1]= new int[] {3,334,54,343,3465,65};
	values[2]= new int[2];
	values[2][0]=55;
	values[2][1]=34;
	values[3]=new int[] {98,78,54,36,37};
	System.out.println(Arrays.deepToString(values));
	
	
	}

}
