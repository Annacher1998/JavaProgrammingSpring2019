package day49;

public class Ebook extends Book{

	
	private double size;
	private int pages;
	
	public void read(int pageNum) {
		
		//reading book by savitch at page 10
		System.out.println("Reading "+ getTitle()+" by "+getAutor()+" at page "+ pageNum);
		
		
	}
	
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	
}
