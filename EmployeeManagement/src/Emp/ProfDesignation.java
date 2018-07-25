package Emp;

public class ProfDesignation extends TeachingStaff {

	private String designation;
	private Integer age;
	
	public ProfDesignation() {
		this.designation= "";
		this.age=0;
		
		 
	}
	
	

	public ProfDesignation(String designation, Integer age) {
		super();
		this.designation = designation;
		this.age = age;
	}



	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public void CalculateSalary() {
		// TODO Auto-generated method stub
		
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}

	
	
	
	
}
