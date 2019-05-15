package day38;
import java.util.*;
public class ContainsAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> nums1=new ArrayList<>();
		nums1.add(10);nums1.add(12);nums1.add(20);nums1.add(30);nums1.add(32);
		
		List<Integer> nums2=new ArrayList<>();
		nums2.add(20);
		nums2.add(10);
		nums2.add(12);
		nums2.add(30);
		nums2.add(32);
		
		//test if nums1 has all nums2
		//System.out.println(nums1.containsAll(nums2));
		if(nums1.containsAll(nums2)) {
			System.out.println("true");
		}else {
		System.out.println("false");
		}
		
		
		System.out.println(nums2.containsAll(nums1));
		boolean b=nums1.containsAll(nums2)&&nums2.containsAll(nums1);
		
		List<String> planA=new ArrayList<>();
		planA.add("java");
		planA.add("replit");
		planA.add("pinpong");
		planA.add("grechka");
		planA.add("run");
		planA.add("sleep");
		
		List<String> planB=new ArrayList<>();
		planB.add("grechka");
		planB.add("run");
		planB.add("sleep");
		planB.add("java");
		planB.add("pinpong");
		planB.add("replit");
		
		if(planB.containsAll(planA)&&planA.containsAll(planB)) {
			System.out.println("Yes, your planA almost the same with planB");
		}else {
			System.out.println("No, your planA doesnt same with planB");
		}
		
		
		
		
	}

}
