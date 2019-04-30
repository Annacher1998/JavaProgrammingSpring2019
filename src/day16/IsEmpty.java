package day16;

public class IsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password = "";
		String username = "";
		System.out.println(username.isEmpty());

		if (username.isEmpty()) {
			System.out.println("Username field cannot be empty");
		} else {
			System.out.println("Username is not empty");
		}

		if (username.isEmpty() || password.isEmpty()) {
			System.out.println("Username or password can not be empty");
		} else {
			System.out.println("Username or password is not empty");
		}

		if (username.length() == 0) {
			System.out.println("Username length is 0 , so its empty");
		}

	}

}
