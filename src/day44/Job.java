package day44;

public class Job {
	/*
	 * 	
	 * 
	 * 	 title , company , annualSalary 
	 *   
	 *   Encapsulate above private instance fields 
	 *   Create no arg constructor 
	 *   	to set title, company to "undefined"
	 *   	
	 *   Create 1 arg constructor to set title
	 *   Create 3 arg constructor to set all 3 fields 
	 *   
	 *   create a method called toString 
	 * */ 
	private String title;
	private String company;
	private double annualSalary;

	// constructor without args
	public Job() {
		System.out.println("No-args constructor");
		this.title = "undefined";//setTitle(title)
		this.company = "undefined";//setCompany(company);
	}

	// constructor with 1 arg
	public Job(String title) {
		System.out.println("1 arg constructor");
		this.title = title;//setTitle(title)
		this.company = "undefined";//setCompany(company);
	}
	// constractor with 3 args

	public Job(String title, String company, double annualSalary) {
		System.out.println("3 args constructor");
		this.title = title;//setTitle(title)
		this.company = company;//setCompany(company);
		this.annualSalary = annualSalary;//setAnnualSalary(annualSalary);
	}

	public String toString() {
		return "\nJob [title=" + title + ", company=" + company + ", annualSalary=" + annualSalary + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

}
