package day50;

public class SlackChannel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SlackUser user=new SlackUser("Nadir");
		AdminUser admin=new AdminUser("Florian");
		user.sendMessage("Beginner’s guide to test automation: ");
		admin.sendMessage("recommend watching Simon Sinek’s speech below. He has many great books as well");
		
		
	}

}
