package day25;

public class PopilationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] populations1= {"Moscow","Alanya","Arlington","Alexandria","Seattle"};
		/*String[] populations=new String[5];
		populations[0]="Moscow";
		populations[1]="Alanya";
		populations[2]="Arlington";
		populations[3]="Alexandria";
		populations[4]="Seattle";
		*/
		System.out.println(populations1[0]);
		
		int[] population=new int[5];
		population[0]=5000;
		population[1]=100000;
		population[2]=200;
		population[3]=19000;
		population[4]=25000;
		System.out.println("City 0 populations: "+population[0]);
		System.out.println("City 1 populations: "+population[1]);
		System.out.println("City 2 populations: "+population[2]);
	System.out.println("City 3 populations: "+population[3]);
	System.out.println("City 4 populations: "+population[4]);
	
	int idx=0;
	System.out.println("City 0 populations: "+population[idx]);
	idx++;
	System.out.println("City 1 populations: "+population[idx]);
	
	String str="abc";
	System.out.println("STR.length population "+population[str.length()]);// it will show you population[3];=>190000
	
	// String array called cities =
	
	String[] cities= {"Miami","Tokyo", "Seatle","New York","London"};
	
System.out.println("Populations of "+ cities[0]+ " is "+ population[0]);
System.out.println("Populations of "+ cities[1]+ " is "+ population[1]);
System.out.println("Populations of "+ cities[2]+ " is "+ population[2]);
System.out.println("Populations of "+ cities[3]+ " is "+ population[3]);
System.out.println("Populations of "+ cities[4]+ " is "+ population[4]);
	
	
	
	}
}