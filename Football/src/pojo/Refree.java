package pojo;

public class Refree implements Pay{

	private String name;
	private Integer age,matches,a,d=800;
	private String designation;
	private String gender;
	
	

	public void Judgement() {
		
		
	}
	public Refree() {
		
		name = "";
		age = 0;
	}

	public Refree(String name, Integer age, Integer matches) {
		
		this.name = name;
		this.age = age;
		this.matches = matches;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getMatches() {
		return matches;
	}
	public void setMatches(Integer matches) {
		this.matches = matches;
	}
	@Override
	public void Calculatesalary() {
		a= matches * d;
		System.out.println("Designation: Refree" +"\nSalary: " +a);
		
	}
	
	
	
}//main
