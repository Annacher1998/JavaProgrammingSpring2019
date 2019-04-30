package day07;

public class PreAndPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=0;
		int num2= num++;
		System.out.println("num: "+ num);
		System.out.println("num2: "+ num2);
	int n =0;
	int n2=++n;

		
	System.out.println("n: "+ n);
	System.out.println("n2: "+ n2);
		
		int i=10;
		i++;
		++i;
		System.out.println("i value :"+i);
		// 
		int s=10;
		int s2= ++s;
		System.out.println("s:"+s);
		System.out.println("s2: "+s2);
	
	int bananas = 6;
	int pears = bananas++;
	int apples = ++bananas;
	System.out.println("bananas:"+bananas);
	System.out.println("pears: "+pears);
	System.out.println("apples: "+ apples);
	
	int friend =10;
	System.out.println(++friend);
	System.out.println(friend);
	
	int p1=10;
	int sum=p1++ + 5;
	System.out.println("p1: "+ p1);
	System.out.println("sum: "+ sum);
	// p1+ 5 first and assign to sum /// p=p+1
	int batteries  = 8;
	int oldBatteries = 5;
	int totalBatteries = batteries++ + ++oldBatteries;
	
	System.out.println("batteries: "+ batteries);
	System.out.println("oldBatteries "+ oldBatteries);
	System.out.println("totalBatarties" + totalBatteries);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
