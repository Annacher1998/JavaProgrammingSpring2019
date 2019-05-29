package day49;

public class PaperBack extends Book {

	
	private int pages;

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	  public String toString() {
		  
		  
		  return "Autor: " +getAutor()+" ,Title: "+ getTitle()+" ,Price: "+getPrice()+",Type: "+getType()+ ", Pages: "+getPages();
				  
	  }
}
