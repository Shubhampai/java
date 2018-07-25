package pojo;

public class Ground {

	private String condition;
	private Integer Sides;
	private Integer playersPlaying;
	private Integer volunteerPresent;
	
	public void Game() {
		
		
	}
	
	public Ground() {
		
		playersPlaying=0;
		condition="";
		System.out.println("Creating object ground");
	}
	
	public Ground(String condition,Integer playersPlaying) {
		
		this.condition=condition;
		this.playersPlaying=playersPlaying;
		
	}
	

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Integer getSides() {
		return Sides;
	}

	public void setSides(Integer sides) {
		Sides = sides;
	}

	public Integer getPlayersPlaying() {
		return playersPlaying;
	}

	public void setPlayersPlaying(Integer playersPlaying) {
		this.playersPlaying = playersPlaying;
	}

	public Integer getVolunteerPresent() {
		return volunteerPresent;
	}

	public void setVolunteerPresent(Integer volunteerPresent) {
		this.volunteerPresent = volunteerPresent;
	}
}
