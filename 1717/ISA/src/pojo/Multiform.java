package pojo;

public  class Multiform extends SmartPhone{

	private String type;
	private Integer price;
	
	public Multiform(Integer imei, String name, Integer rsize, String sim, String osname, String type, Integer price) {
		super(imei, name, rsize, sim, type);
		this.imei = imei;
		this.type = type;
		this.price = price;
		this.osname = osname;
		this.type = type;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}



}
