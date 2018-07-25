package pojo;

public class Stadium {

	private Integer capacity;
	private String condition;
	private String availability;
	
	public void AllowPlay() {
		
		
	}

	public Stadium() {
		
		capacity = 0;;
	condition = "";
	}

	
	public Stadium(Integer capacity, String condition) {
		
		this.capacity = capacity;
		this.condition = condition;
	}



	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}
}
