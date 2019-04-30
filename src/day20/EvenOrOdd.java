package day20;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");// even numbers

			}
		}
		System.out.println();
		for (int j = 1; j <= 100; j++) { /// odd numbers
			if (j % 2 !=0) {
				System.out.print(j + " ");

			}
		}
		int sumOfOdds = 0;
		int sumOfEven = 0;
		for (int num = 1; num <= 100; num++) {
			if (num % 2 == 0) {
				sumOfEven += num;
			} else {
				sumOfOdds += num;
			}
		}
		System.out.println();
		System.out.println("Sum of even:"+sumOfEven);
		System.out.println("Sum of odds: "+sumOfOdds);
	}

}
