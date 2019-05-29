package day42;

public class Starbucks {

	
	String name;
	double price;
	int cal;
	String size;
	
	
	
	public void size() {

		if(name.equalsIgnoreCase("Iced Caramel Machiatto")&&size.equalsIgnoreCase("Tall")){
			price=3.95;
			cal=180;
		}else if(name.equalsIgnoreCase("Iced Caramel Machiatto")&&size.equalsIgnoreCase("Grande")) {
			price=4.75;
			cal=250;
			
		}else if(name.equalsIgnoreCase("Iced Caramel Machiatto")&&size.equalsIgnoreCase("Venti")) {
			price=5.25;
			cal=350;
		}
	
	}
	public void getCoffeeInfo() {
		
		System.out.println("Name: "+ name+" Price: "+price+" Callories: "+cal+" Size: "+size);
		
	}
	public void setName(String newName) {
		name=newName;
		
	}
	public void setPrice(double newPrice) {
		price=newPrice;
	
	}
	public void setSize(String newSize) {
		
	if(newSize.equalsIgnoreCase("tall") ||
		newSize.equalsIgnoreCase("grande")||
		newSize.equalsIgnoreCase("venti")){
		size=newSize;
	}else {
		System.out.println("Error:Invalid size -"+ newSize);
		size="Uknown";
	}
	}
	public void setCal(int newCal) {
		cal=newCal;
	
	}
	public void setCoffeeInfo(String newName,String newSize,double newPrice,int newCal) {
		name=newName;
		size=newSize;
		price=newPrice;
		cal=newCal;
		
		
		
		
	}
	
}
