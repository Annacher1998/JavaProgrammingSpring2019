package day25;

public class ShoppingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] product= {"Timberland shoes", "H&M Shirt","Swatch Watch", "Gucci bag","Adidas socks"};
		double[] price= {200.0, 5.99, 150.0,3000.5,6.99};
		int[] itemsId= {1212,12323,34347,34349,34343};
		
		//print count of product
		System.out.println("Product count is: " +product.length);
		
		// check if product ,prices, and items ids have same count
		if(product.length==price.length&&itemsId.length==product.length) {
			System.out.println("Shopping list looks good ");
		}else {
		System.out.println("Something is wrong");
		return;
	}
		
		
		System.out.println("*****************");
		// loop product and print each product
         for(String products:product) {
        	 System.out.println("Product is:"+ products + ";");
        	 
         }
         System.out.println("****************");
		// loop price and print each price
		for(double prices:price) {
			System.out.println("Price is "+prices+ ";" );
		}
		System.out.println("*******************");
		// loop itemsId and print each id
		for(int id:itemsId) {
			System.out.println("Item id is "+ id+ ";");
		}
		System.out.println("*******************");
		// for loop for prices
		for(int i=0;i<=price.length-1;i++) {
			System.out.println("And price is: "+ price[i]+";");
		}
		
		
		//itemsId--> print this in reverse order
		System.out.println("/////REVERSE////////////");
		/////////////////REVERSE/////////////
		for(int idx=itemsId.length-1;idx>=0;idx--) {
			System.out.println("Reverse items Id: "+itemsId[idx]);
		}
	// print a report with total price
		// item 1: 1213-Timberland Shoes-120$
		System.out.println("******************************");
		double totalPrice=0;
		
		for(int i=0;i<product.length;i++) {
			totalPrice+=price[i];
			System.out.println("Item "+ (i+1)+": "+ itemsId[i]+" - "+ product[i]+" "+ price[i]+ "$" );
		
		} 
		System.out.println("And total price: "+ totalPrice);
		System.out.println("******************************");
		/// find the most expensive item in your list and print it
		int maxIndex=0;
		double max=0;
		for(int i=0;i<price.length;i++) {
			if(price[i]>max) {
				max+=price[i];
				maxIndex=i;
			}

		}
		System.out.println("And max price in our list is: " +max+ ". And max Index is: "+itemsId[maxIndex]);
		
		
		
		
		
		
		
		
		
	}

}
