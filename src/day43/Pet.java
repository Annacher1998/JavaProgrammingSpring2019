package day43;

public class Pet {

	private String type;
	private String name;
	 
	
	public Pet(String type,String name) {
		this.type=type;
		this.name=name;
	}
	public Pet() {
		System.out.println("No args constructor");
	}
	
	public void speak() {
		switch (type.toLowerCase()) {
		case "cat": 
			System.out.println("Myauu");
			break;
		case"dog":
			System.out.println("Gav gav");
			break;
		case "bird":
			System.out.println("chick chirik");
		case "goat":
			System.out.println("mhaeee");
			break;
		case "sheep":
			System.out.println("Beee");
		case"roosters":
			System.out.println("u uruuuu uuuuu");
			break;
			default:
				System.out.println("...");
		}
	}
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}
	
public String geName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}

public String toString() {
	return "Pet [type=" + type + ", name=" + name + "]";
}


}

