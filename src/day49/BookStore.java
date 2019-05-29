package day49;

public class BookStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Ebook ebook=new Ebook();
		ebook.setTitle("Introduction to Java programing ");
		ebook.setAutor("Savitch");
		ebook.setPages(1016);
		ebook.setPrice(150);
		ebook.setSize(490);
		ebook.setType("Tech book");
		
		System.out.println(ebook.getPages());
		System.out.println(ebook.getAutor());
		System.out.println(ebook.toString());
		
		//read method in Ebook class
		ebook.read(20);
		AudioBook audioBook=new AudioBook();
		audioBook.setAutor("Jeanne");
		audioBook.setTitle("OCA preperation");
		//read method from AudioClass
		audioBook.listen("Marufjon");
		
		
		
		PaperBack paperBack=new PaperBack();
		paperBack.setAutor("Bert Bates and Kathy Sierra");
		paperBack.setPages(500);
		paperBack.setPrice(120);
		paperBack.setTitle("Head first Java");
		paperBack.setType("PaperBack");
		System.out.println(paperBack.toString());
	}

}
