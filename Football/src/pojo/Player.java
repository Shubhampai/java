package pojo;

public class Player extends Team implements Pay{

	private String name;
	private Integer age;
	private String play_position;
	private String gender;
	private Integer Tee_no;
	Integer No; Integer Goals,a,d=1000;
	

	
	public void Kick() {
		
			System.out.println("KICK");
		
	}
	
	public Player() {
		
		age=0;
		name="";
		System.out.println("Creating object");
		
	}
	
	public Player(String name,Integer age, String gender,Integer Goals ) {
		this.name= name;// self refrencing
		this.age= age;
		this.gender=gender;
		this.Goals = Goals;
		
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


	public String getPlay_position() {
		return play_position;
	}


	public void setPlay_position(String play_position) {
		this.play_position = play_position;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Integer getTee_no() {
		return Tee_no;
	}


	public void setTee_no(Integer tee_no) {
		Tee_no = tee_no;
	}



	@Override
	public void Payment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Calculatesalary() {
		
		a= Goals * d;
		System.out.println("Salary: " +a);
		
	}

	public Integer getGoals() {
		return Goals;
	}

	public void setGoals(Integer goals) {
		Goals = goals;
	}
	
	
}//main
