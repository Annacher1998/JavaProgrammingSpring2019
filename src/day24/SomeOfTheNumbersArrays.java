package day24;
import java.util.Arrays;
public class SomeOfTheNumbersArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//lets create an arrays of integers with length 3
		int[] numbers=new int [3];
		//first number of array
		numbers[0] =5;
		// second number of array
		numbers[1]=10;
		// third num of array
		numbers[2]=20;
		//to string() from arrays class can help us to print an arrays as string
		System.out.println(Arrays.toString(numbers));
		//System.out.println(numbers[0]);
		//System.out.println(numbers[1]);
		//System.out.println(numbers[2]);
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			// numbers.length==>returns number of element in the arrays
			// numbers.length==5;
			
			sum+=numbers[i];
			
		}
		System.out.println("Sum:"+sum);
		// find biggest value of array
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>max) {
				max=numbers[i];
			}
		
		}
		System.out.println("Max value of arrays :"+ max);
		// find min value of arrays
		
		int min=Integer.MAX_VALUE;
		for(int k=0;k<numbers.length;k++) {
			if(numbers[k]<min) {
				min=numbers[k];
			}
		}
		System.out.println("min value is:"+min);
		
	}

}
