package pojo;

public abstract class Team {
	//main
	private String name;
	private Integer total;
	private String gender;
	
	public abstract void Payment();
	
	public void Play() {
		
		
	}

	public Team() {
		
		name = "";
		total = 0;
		gender = "";
	}
	public Team(String name, Integer total, String gender) {
		
		this.name = name;
		this.total = total;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}//main
