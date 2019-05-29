package day50;

public class TestAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal an=new Animal();
		an.speak();
		
		Cat cat=new Cat();
		cat.speak();
		
		Dog dog=new Dog();
		dog.speak();
		
		Duck duck=new Duck();
		duck.speak();
		System.out.println("######");
		cat.move(12);
		dog.move(3);
		duck.move(45);
		an.move(23);
		
		
		
		
		
		
		
	}

}
