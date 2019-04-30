package day08;

public class ifElseIsVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temperature=45;
		 if ( temperature >= 65) {
			 
			 System.out.println("Its a nice day");
		 }else { 
			 System.out.println("Stay home and code java");
			  
			 
		 }
	
	//2 int variables , teamAScore , teamBScore
		 // put a condition , check if theamA won "team a won,// else team b won or it was a draw
	int teamAScore=9;
	int teamBScore=12;
	if (teamAScore >= teamBScore) {
	System.out.println("Team A won!");
	System.out.println("Go team A");
	}else {
		System.out.println("Team B won or it was a draw!");
		System.out.println("Go teams!");
	}
	
	
	
	}
	
	

}
