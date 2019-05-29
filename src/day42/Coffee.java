package day42;

public class Coffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Starbucks coffe=new Starbucks();
coffe.name="Iced Caramel Machiatto";
coffe.size="Venti";
coffe.size();
coffe.getCoffeeInfo();

Starbucks coffee2=new Starbucks();
coffee2.setName("Java chip");
coffee2.size="Venti";
coffee2.price=5.95;
coffee2.cal=600;
coffee2.getCoffeeInfo();

Starbucks coffee3=new Starbucks();
coffee3.setName("Iced Coffee");
coffee3.setSize("grande");
coffee3.setPrice(2.45);
coffee3.setCal(60);
coffee3.getCoffeeInfo();


Starbucks coffe4=new Starbucks();
coffe4.setCoffeeInfo("flat white", "tall", 3.95, 170);
coffe4.getCoffeeInfo();




	}

}
