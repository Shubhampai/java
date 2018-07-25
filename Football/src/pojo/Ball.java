package pojo;

public class Ball {

	private String pattern;
	private Integer size;
	
	
	
	public void Shot() {
		
	}

	public Ball() {
		
		size=0;
		pattern="";
		System.out.println("Creating object ball");
	}
	
	public Ball(String pattern,Integer size) {
		
		this.size=size;
		this.pattern=pattern;
		
	}
	
	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}
	
}
