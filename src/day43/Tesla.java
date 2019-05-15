package day43;

public class Tesla {

	
	

	private String model;
	private double zeroTo60;
	private double price;
	private int range;
	private boolean selfDriving;
	
	
	public String toString() {
		return "Tesla [model=" + model + ", zeroTo60=" + zeroTo60 + ", price=" + price + ", range=" + range
				+ ", selfDriving=" + selfDriving + "]";
	}
	
	 //MODEL
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		//call isValidModel here then assign if true
		//if false : Invalid  model -Camry;
		//assign "unknown "to model
		 if(isValidModel(model)) {
			 this.model=model;
				
			}else {
				System.out.println("Invalid model "+  model);
				this.model="unknown";
			}
	}
	//ZEROTO60
	
	public double getZeroTo60() {
		return zeroTo60;
	}
	public void setZeroTo60(double zeroTo60) {
		this.zeroTo60=zeroTo60;
	}
	
	
	//PRICE
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	//RANGE
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range=range;
	}
	
	//SELF-DRIVING
	public boolean isSelfDriving() {
		return selfDriving;
	}
	public void setSelfDriving(boolean selfDriving) {
		this.selfDriving=selfDriving;
	}

	//ISVALIDMODEL
	public boolean isValidModel(String model) {

		if (model.equalsIgnoreCase("Model S")) {
			return true;
		} else if (model.equalsIgnoreCase("Model 3")) {
			return true;
		} else if (model.equalsIgnoreCase("Model X")) {
			return true;
		} else if (model.equalsIgnoreCase("Roadster")) {
			return true;
		} else {
			return false;
		}
}
	//Another approach:
	/*
	 * return model.equals("model s") || 
			   model.equals("model 3") ||
			   model.equals("model x") || 
			   model.equals("model y") ||
			   model.equals("roadster");
	 */
	public void setTeslaInfo(String model,double zeroTo60, double price, int range, boolean selfDriving) {
          setModel(model);
          setZeroTo60(zeroTo60);
          setPrice(price);
          setRange(range);
          setSelfDriving(selfDriving);
		
	}
	public static void buy(Tesla car) {
		System.out.println("Purchasing : "+ car.toString());
		
	}
	
	

}
