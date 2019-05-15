package day43;

public class Computer {
	
		private String brand;
		private String os;
		private double price;

		
		
		// First constructor
		
		public Computer() {
			System.out.println("Computer constructor...");
			brand="uknown";
			os="uknown";
		}
		//Second constructor
		public Computer(String brand,String os,double price) {
			System.out.println("###Three parameters construcor###");
			this.brand=brand;
			this.os=os;
			this.price=price;
		}
		
		public String getBrand() {
			return brand;
		}
public void setBrand(String brand) {
	this.brand=brand;
}
		public String getOs() {
			return os;
		}
		public void setOS(String os) {
			this.os=os;
		}
		
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price=price;
		}
	
		public String toString() {
			return "Computer [brand=" + brand + ", os=" + os + ", price=" + price + "]";
		}
}
