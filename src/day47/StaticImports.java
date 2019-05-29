package day47;
import static java.lang.Math.*; 
import static java.lang.Character.*;
import static java.util.Arrays.sort;
import java.util.Arrays;
import static java.time.LocalDateTime.now;
public class StaticImports {

	
	
	
	public static void main(String[] args) {
		System.out.println(PI);//
		System.out.println(max(10,5));
		System.out.println(max(10,10));
		System.out.println(min(10,100));
		System.out.println(floor(3.45));
		System.out.println(round(45.99));
		System.out.println(abs(-19));
		System.out.println(pow(12,23));
		System.out.println(sqrt(5));
		
		
		System.out.println(isDigit('3'));
		System.out.println(isAlphabetic('J'));
		int[] nums= {34,44,22,11,555,1200};
		sort(nums);
		System.out.println(Arrays.toString(nums));
		System.out.println( now() );
		
		
	}
	
}
