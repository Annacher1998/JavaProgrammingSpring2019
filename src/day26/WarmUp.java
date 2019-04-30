package day26;

import java.util.Arrays;
import java.util.Random;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] popularNames= { "James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Michael", "Linda",
				"William", "Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Sarah",
				"Charles", "Margaret", "Christopher", "Karen", "Daniel", "Nancy", "Matthew", "Lisa", "Anthony", "Betty",
				"Donald", "Dorothy", "Mark", "Sandra", "Paul", "Ashley", "Steven", "Kimberly", "Andrew", "Donna",
				"Kenneth", "Emily", "George", "Carol", "Joshua", "Michelle", "Kevin", "Amanda", "Brian", "Melissa",
				"Edward", "Deborah", "Ronald", "Stephanie", "Timothy", "Rebecca", "Jason", "Laura", "Jeffrey", "Helen",
				"Ryan", "Sharon", "Jacob", "Cynthia", "Gary", "Kathleen", "Nicholas", "Amy", "Eric", "Shirley",
				"Stephen", "Angela", "Jonathan", "Anna", "Larry", "Ruth", "Justin", "Brenda", "Scott", "Pamela",
				"Brandon", "Nicole", "Frank", "Katherine", "Benjamin", "Samantha", "Gregory", "Christine", "Raymond",
				"Catherine", "Samuel", "Virginia", "Patrick", "Debra", "Alexander", "Rachel", "Jack", "Janet", "Dennis",
				"Emma", "Jerry", "Carolyn", "Tyler", "Maria", "Aaron", "Heather", "Henry", "Diane", "Jose", "Julie",
				"Douglas", "Joyce", "Peter", "Evelyn", "Adam", "Joan", "Nathan", "Victoria", "Zachary", "Kelly",
				"Walter", "Christina", "Kyle", "Lauren", "Harold", "Frances", "Carl", "Martha", "Jeremy", "Judith",
				"Gerald", "Cheryl", "Keith", "Megan", "Roger", "Andrea", "Arthur", "Olivia", "Terry", "Ann", "Lawrence",
				"Jean", "Sean", "Alice", "Christian", "Jacqueline", "Ethan", "Hannah", "Austin", "Doris", "Joe",
				"Kathryn", "Albert", "Gloria", "Jesse", "Teresa", "Willie", "Sara", "Billy", "Janice", "Bryan", "Marie",
				"Bruce", "Julia", "Noah", "Grace", "Jordan", "Judy", "Dylan", "Theresa", "Ralph", "Madison", "Roy",
				"Beverly", "Alan", "Denise", "Wayne", "Marilyn", "Eugene", "Amber", "Juan", "Danielle", "Gabriel",
				"Rose", "Louis", "Brittany", "Russell", "Diana", "Randy", "Abigail", "Vincent", "Natalie", "Philip",
				"Jane", "Logan", "Lori", "Bobby", "Alexis", "Harry", "Tiffany", "Johnny", "Kayla" };

		System.out.println("There are: " + popularNames.length + " names");
		
		//print males name
		System.out.println("MALE NAMES");
		for(int i=0;i<popularNames.length;i+=2) { 
				System.out.print(popularNames[i]+", ");
			
		}
		
	//print all names in single line
		System.out.println();
		System.out.println("ALL NAMES IN SINGLE LINE TO STRING");
				System.out.println(Arrays.toString(popularNames));
		
				/// print all women names 
System.out.println("WOMEN NAMES");
		for(int a=1;a<popularNames.length;a+=2) {
			System.out.print(popularNames[a]+", ");
		}
		
		
		
		// print in column format
		System.out.println();
		System.out.println("ALL NAMES IN COLUMN FORMAT");
		for(int i=0;i<popularNames.length;i+=2) {
			System.out.println(popularNames[i]+", "+ popularNames[i+1]);
		}
		
		// print random name from this array
		System.out.println("RANDOM NAME");
		Random random=new Random();
		int r=random.nextInt(popularNames.length);
		System.out.println("And random name is : "+popularNames[r]);
		
		
		// print all names up to 4 characters , in upper case  in same line
		System.out.println("ALL NAMES UP TO 4 CHARACTERS");
		for(String names:popularNames) {
			if(names.length()<=4) {
				System.out.print(names.toUpperCase()+", ");
			}
		}
		System.out.println();
		String namesUpto4="";
		String names5to6="";
		String names7orMore="";
		
		for(String names1:popularNames) {
			if(names1.length()<=4) {
				namesUpto4+=names1+", ";
			
			}else if(names1.length()==5||names1.length()==6) {
				names5to6+=names1+", ";
				
				
			}else if(names1.length()>=7) {
				names7orMore+=names1+", ";
				
				
		}
		}

		System.out.println("Names less than 4 characters: " +namesUpto4);
		System.out.println("Names between 5 and 6 characters : "+names5to6);
		System.out.println("Names with 7 and more characters: "+names7orMore);
		
		// SWAP names
		
		
		System.out.println(Arrays.toString(popularNames));
		for(int a=0;a<popularNames.length;a+=2) {
			String temp=popularNames[a];
			popularNames[a]=popularNames[a+1];
			popularNames[a+1]=temp;
		}
		System.out.println(Arrays.toString(popularNames));
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
