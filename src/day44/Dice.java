package day44;
import java.util.*;
public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job job1 = new Job();
		Job job2 = new Job("Java developer");
		Job job3 = new Job("Sdet", "Delloit", 100_000.00);
		System.out.println(job1.toString());
		System.out.println(job2.toString());
		System.out.println(job3.toString());
		
		
		//create list of jobs
		// and add 5 jobs ,with company ,salary and title
		
		
		ArrayList<Job> arr=new ArrayList<>() ;
		arr.add(job3);
		arr.add(new Job("Scrum master","Google",123000.00));
		arr.add(new Job("SDET","FreddieMac",125000.00));
		arr.add(new Job("BA","Liedos",100000.00));
		arr.add(new Job("Senior QA tester","Delta",155000.00));
		System.out.println(arr.toString());
		//find the highest paying job and print it
		double maxSalary=0;
		int index=-1;
		for(int i=0;i<arr.size();i++) {
			if(maxSalary<arr.get(i).getAnnualSalary()) {
				maxSalary=arr.get(i).getAnnualSalary();
				index=i;
			}
		}
		Job bestJob=arr.get(index);
		System.out.println("Highest salary: "+bestJob.toString());
	}

}
