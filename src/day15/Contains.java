package day15;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email="test@gmail.com";
		System.out.println(email.contains("@"));
		
		String list="potatoes , apples, eggs, tomatoes";
if(list.contains("apples"))	{
	System.out.println("Yes, apples are there");
}else {
	System.out.println("Lets add apples now");
}
      boolean hasEggs=list.contains("eggs");
		
		System.out.println("Is list include eggs? "+hasEggs);
	
	  boolean hasCucumber=list.toLowerCase().contains("cucumbers");
	System.out.println("List contains: "+hasCucumber);
	
	email="name@yahoo.com";
		if (email.contains("@yahoo")) {
			System.out.println("Yahoo account");
		} else if (email.contains("gmail")) {
			System.out.println("Gmail account");
		} else if (email.contains("@hotmail")) {
			System.out.println("Hotmail account");
		}

		String etsyTitle = "Wooden spoon | Etsy";
		if (etsyTitle.contains("|")) {
			System.out.println("Yes, it has a pipe");
		} else {
			System.out.println("Unknown symbol");
		}
		String name = "Alexander";
		if (name.contains("a") || name.contains("e")) {
			System.out.println("Yes ,a and e contain in your name");
		} else {
			System.out.println("failed");
		}

	}

}
