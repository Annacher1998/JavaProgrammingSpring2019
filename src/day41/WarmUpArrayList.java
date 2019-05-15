package day41;
import java.util.*;
public class WarmUpArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(2);
		nums.add(3);
		nums.add(4);
		System.out.println(doubleTheList(nums));

	}
	public static ArrayList<Integer> doubleTheList(ArrayList<Integer> num){
		
		
		for(int i=0;i<num.size();i++) {
			num.set(i,num.get(i)*2);
		}
		
		return num;
		
		
		
		
	}

}
