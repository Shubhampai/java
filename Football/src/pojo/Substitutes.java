package pojo;

public class Substitutes extends Team {
	
	private String name;
	private String condition;
	private Integer age;
	private String play_position;
	Integer No;
	Integer Goals;
	public void Replace() {
		
		
	}
	
	
	public Substitutes() {
		
		name = "";
		age = 0;;
	}
	public Substitutes(String name, Integer age) {
	
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPlay_position() {
		return play_position;
	}

	public void setPlay_position(String play_position) {
		this.play_position = play_position;
	}


	@Override
	public void Payment() {
		 System.out.println("Payment for Substitute Player");
			
	}
	
	

}//main



