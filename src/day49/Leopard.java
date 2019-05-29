package day49;

public class Leopard extends Animal {

	
	
	public Leopard() {
		super();//call super class 
		System.out.println("Leopard constructor ");
		setType("Leopard");
	}
	
	public Leopard(String type) {
		
		super(type);//call Animal 1 arg constructor
		System.out.println("Leopard 1 arg-constructor");
		
	}
	
}
