package day34;
import java.util.*;
public class MethodsWithArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//calling methods from another class
		System.out.println(Arrays.toString(MethodsWithArray.getArray()));
		//store old value of array into new array
		int[] newArray=MethodsWithArray.getArray();
		System.out.println(Arrays.toString(newArray));
		
		//return random array
	//	for(;;) {//infintet loop ==> same as while(true) loop
		System.out.println(Arrays.toString(getRandomArray(7)));
		//}
		int[] RandomNum=MethodsWithArray2.getRandomArray(5);
		System.out.println(Arrays.toString(RandomNum));
		
	}
	public static int[] getRandomArray(int size) {
		
		 int[] nums=new int[size];// declare arrays with size number of elements
		 Random ran=new Random();//create random class object 
			for(int i=0;i<size;i++) {
				nums[i]=ran.nextInt(101);//get random numbers and assign it to array 
			}
		
		return nums;
	}

}
