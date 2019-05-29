package day49;

public class AudioBook extends Book {

	private double length;
	private String narrator;
	
	
	public void listen(String narrator) {
		
		//listening to java book by savitch and narrated by Marufjon
		this.narrator=narrator;
		
		System.out.println("Listening to "+ getTitle()+" by "+ getAutor()+" and narrated by "+ narrator);
	}
	public double getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getNarrator() {
		return narrator;
	}
	public void setNarrator(String narrator) {
		this.narrator = narrator;
	}
	
	
	
}
