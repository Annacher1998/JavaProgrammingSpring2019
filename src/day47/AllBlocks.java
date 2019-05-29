package day47;

public class AllBlocks {

	int nonStatic=10;
	static int staticInt=10;
	
	static {
		System.out.println("static block-i run first and only once");
		staticInt--;//9
	}
	
	{
		System.out.println("Init block -i run each time object is created , before constructor");
		nonStatic+=5;//15  ///15
		staticInt+=5;//14 //22
	}
	public AllBlocks() {
		System.out.println("Constructor -I run each time object is created.After init block was created");
		nonStatic+=3;//18    //18
		staticInt+=3;//17 second time :25
	
	}
}
