package day50;

public class AndroidApp  extends App{

	
	
	String developer;

	public AndroidApp() {
		super("Android app-uknown");
	}
	
	public AndroidApp(String name) {
		super(name);
	}
	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}
	
	
	
	
}
