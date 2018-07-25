package Emp;

public class NonTeachingStaff extends Staff {

	private Integer Adminhours;

	public NonTeachingStaff() {
		this.Adminhours=0;
		
	}
	
	public NonTeachingStaff(Integer adminhours) {
		super();
		Adminhours = adminhours;
	}

	

	public Integer getAdminhours() {
		return Adminhours;
	}

	public void setAdminhours(Integer adminhours) {
		Adminhours = adminhours;
	}
	
	
	@Override
	public void CalculateSalary() {
	System.out.println("\nNon Teaching Staff Salary: ");
		
	}
	
	
}
