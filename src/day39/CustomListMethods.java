package day39;
import java.util.*;
public class CustomListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(12);
		nums.add(78);
		nums.add(11);
		
		printList(nums);
		//*****************************************
		List<Double> nums1 = new ArrayList<>();
		nums1.add(12.4);
		nums1.add(88.88);
		nums1.add(2.98);
		System.out.println(sumList(nums1));
////////***************************************************
		System.out.println(getList(10));
                    //OR
		ArrayList<Integer> numbers = getList(10);
		System.out.println(numbers.toString());
		//***************************************************
		System.out.println(getRandomList(12));
		
		//***************************************************
		ArrayList<String> letter=new ArrayList<>();
		letter.add("12");
		letter.add("34");
		letter.add("54");
		System.out.println(convert(letter));
		List<Integer> converted=convert(letter);
		System.out.println(converted);
		//**********************************************
		
	}

	public static void printList(ArrayList<Integer> nums) {
		// print each value in same value separated by space
		for (Integer i : nums) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

	public static double sumList(List<Double> nums) {
		double sum = 0.0;
		for (Double s : nums) {
			sum += s;
		}
		return sum;
	}

	public static ArrayList<Integer> getList(int size) {

		ArrayList<Integer> nums = new ArrayList<>();

		for (int i = 1; i <= size; i++) {
			nums.add(i);
		}
		return nums;
	}
	
	public static List<Integer> getRandomList(int size) {
		Random ran=new Random();
		List<Integer> nums = new ArrayList<>();
		for(int i=1;i<=size;i++) {
			nums.add(ran.nextInt(101));
		}
		return nums;
	}
public static List<Integer> convert(List<String> words){
	//words.add("99");
//	words.add("2");
	//words.add("3");
	
	List<Integer> nums=new ArrayList<>();
	for(int i=0;i<words.size();i++) {
		nums.add(Integer.parseInt(words.get(i)));
	}
	return nums;
}
	
	
	
	
	
	
	

}
