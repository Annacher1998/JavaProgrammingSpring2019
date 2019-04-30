package day19;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner (System.in);
Random random=new Random();

int secretNum=random.nextInt(101);

int guessNum;
int max=5;
System.out.println("## Welcome to guess game####");
do {
	System.out.println("Enter guess number:");
	guessNum=scan.nextInt();
	
	if(guessNum>secretNum) {
		System.out.println("Guess num is too big");
		
	}else if(guessNum<secretNum) {
		System.out.println("Guess num is so small");
	}else if(guessNum==secretNum){
		System.out.println("Bingo, Congradulations , you won");
	}
	
	max--;
	if(max==4) {
		System.out.println("Don't worry , have 4 left tries!");
	}else if(max==3) {
		System.out.println("You in a good shape, don't give up, and you have 3 more!");
	}else if(max==2) {
		System.out.println("Bro,you still can do it, and you have 2 left!");
	}else if(max==1) {
		System.out.println("Dont getting crazy, its just a game, you have 1 more!");
	}else if(max==0&&guessNum==secretNum) {
		System.out.println("Congradulations , you got it!");
	}else if(max==0 ) {
		System.out.println("Bro, I'm sorry, pleasy try next time!");
	
	}
	
	}while(guessNum!=secretNum&&max>0);

}

}
