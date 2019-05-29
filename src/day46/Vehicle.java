package day46;

public class Vehicle {

	
	String type;
	static int numberOfVehicle;
	public static void vehicleInfo() {
		//System.out.println("type: "+ type);//will not compile,type is non-static
		int count=getNumberOfVehicle();
		String make="kia";
		make=make.toUpperCase();
		//Vehicle vh=new Vehicle();
		//vh.toString()
		
	}
	public static int getNumberOfVehicle() {
		return numberOfVehicle;
	}
	
	
	public String toString() {
		return "Vehicle type: "+ type+" | number of Vehicle: "+ numberOfVehicle;
	}
}
