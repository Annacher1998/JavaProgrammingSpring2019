package day53;

public class Capitol extends City {

	private long population;
    public int count =1;
	public Capitol(int id, String name,long population) {

		super(id, name);
        this.population=population;
	}
	
	
	@Override
	public void letsBuildRoad() {
		buildARoad();
	}
	
	
	public static void buildARoad() {
		System.out.println("Capital city- building a road");
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}
public void displayCount() {
	System.out.println("City count: "+super.count);
	System.out.println("Capital count: "+count);
}
	@Override
	public String toString() {
		return super.toString()+" population: "+population+" ppl"+ " count: "+count;
	}
	
	
}
