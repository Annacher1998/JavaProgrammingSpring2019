package day50;

public class IphoneApp extends App {

	
	String developer;

	public IphoneApp() {
		super("Iphone app-uknown");
	}
	
	public IphoneApp(String name) {
		super(name);
	}
	
	
	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}
	
	
}
