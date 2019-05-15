package day43;

public class TeslaDealer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Tesla car=new Tesla();
		car.setModel("Model 3");
		car.setSelfDriving(true);
		car.setPrice(89.999);
		car.setRange(370);
		car.setZeroTo60(2.4);
		
		System.out.println("Model: "+car.getModel());
		System.out.println("Price: "+car.getPrice());
		System.out.println("Range: "+ car.getRange());
		System.out.println("ZeroTo60: "+car.getZeroTo60());
		System.out.println("Self-driving: "+car.isSelfDriving());
		System.out.println(car);
		System.out.println(car.toString());
		System.out.println("IsValidModel: "+car.isValidModel("model 3"));
	   
		Tesla car2=new Tesla();
	   car2.setTeslaInfo("model x", 3.5, 120000, 340, true);
	   System.out.println(car2.toString());
	   
	   
	   if(car.getZeroTo60()>car2.getZeroTo60()) {
		   System.out.println("Model 3-"+ car.getZeroTo60()+" faster than model x-"+car2.getZeroTo60());
	   }else {
		   System.out.println("model x- "+car2.getZeroTo60()+" faster than model 3- "+car.getZeroTo60());
	   }
	  
	   
	   car2.buy(car2);
	   System.out.println(testDrive("Model S"));
	}   //main method
	   
	   public static Tesla testDrive(String model) {

			System.out.println("I would like to test drive- " + model);
			System.out.println("Sure, let me build object and return it");
			Tesla car3 = new Tesla();
			car3.setTeslaInfo(model, 3.9, 180999, 310, false);
			return car3;
		}
	

	
}



