package day40;

public class BestBuy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CellPnoneClass cell1 =new CellPnoneClass();
		
		cell1.brand="Nokia 6200";
		cell1.color="white";
		cell1.screenSize=2.0;
		cell1.price=78.99;
		
		
		
		System.out.println("Brand: "+cell1.brand);
		System.out.println("ScreenSize: "+cell1.screenSize);
		System.out.println("Color: "+cell1.color);
		System.out.println("Price: "+cell1.price);
		cell1.color="Black";
		System.out.println("Color: "+cell1.color);
		System.out.println();
		CellPnoneClass cell2 =new CellPnoneClass();
		cell2.brand="Samsung";
		cell2.color="Silver";
		cell2.price=999.99;
		cell2.screenSize=5.5;
		
		
		System.out.println("Brand: "+cell2.brand);
		System.out.println("ScreenSize: "+cell2.screenSize);
		System.out.println("Color: "+cell2.color);
		System.out.println("Price: "+cell2.price);
		
		
		System.out.println("#####CALLING METHODS");
		//Call methods for cell1
		cell1.call();
		cell1.message();
		//Call methods for cell2
		cell2.call();
		cell2.message();
		 //call method TakePicture
		cell1.takePicture();
		cell2.takePicture();
		
	}

}
