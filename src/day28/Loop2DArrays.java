package day28;

import java.util.Arrays;

public class Loop2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] pizzas= { 
			{"pineapple","pepperoni"},//0
			{"anchovies","mushroom","olives"},//1
			{"4 cheese"},//2
			{"chicken","tomatoes","pepers"},//3
			{"green pepers","feta cheese", "broccoli"},//4
			};
		
		System.out.println(Arrays.toString(pizzas[0]));
		for(String[] pizza:pizzas) {
			System.out.print(pizza.length+"-");
			System.out.println(Arrays.toString(pizza));
			
		}
		System.out.println("#########FOR LOOP");
		for(int i=0;i<pizzas.length;i++) {
			System.out.print(pizzas[i].length+"-");
			System.out.println(Arrays.toString(pizzas[i]));
		}
		
		for(String topping:pizzas[4]) {
			System.out.println(topping+",");
		}
		
		int[][] students= {
				{4,5,6,},
				{3,6,7,8},
				{1,2,4,5,6,6}
				};
		//2 parts outer loop, and inner loop
		//outer loop will take eahc group
		//inner loop will take each value/student id
		for(int[] group:students) {
			for(int studentId:group) {
				System.out.print(studentId+" ,");
			}
			System.out.println();
		}
		int[] []  nums= {
				        {10,20},//0
				        {20,30,40,50},//1
				        {100,200,400},//2
				        {333,555,111,444,111,344},//3
		                 };
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				System.out.println(nums[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
