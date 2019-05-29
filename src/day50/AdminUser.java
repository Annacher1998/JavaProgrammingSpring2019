package day50;

public class AdminUser extends SlackUser {

	
	public AdminUser(String name) {
		super(name);
	}
	
	
	@Override
	public void sendMessage(String message) {
		System.out.println("@channel");
		System.out.println(getName()+" is sending message <"+ message+">");
		
	}
	
	
	
}
