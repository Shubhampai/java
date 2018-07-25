package Emp;

public abstract class Staff {
	protected String name;

	public Staff() {
		this.name="";
		
	}
	
	public abstract void CalculateSalary();
	
	public Staff(String name) {
		super();
		this.name = name;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



}
