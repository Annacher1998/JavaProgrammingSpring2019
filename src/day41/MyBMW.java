package day41;

public class MyBMW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW car = new BMW();

		car.model = "330i Sedan";
//car.price=40250.00;

		car.showPrice();

		car.model = "740i Sedan";
//car.price=86050.00;

		car.showPrice();
		car.model = "M3 Sedan";
//car.price=66550.00;

		car.showPrice();

		BMW car1 = new BMW();
		car1.model = "X3";
		car1.showPrice();

	}

}
