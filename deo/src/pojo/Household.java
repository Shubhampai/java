package pojo;

public class Household extends Shopping{
	private String Brand;
	private Integer price;
	

	public Household(Integer shopid,String brand,Integer price) {
		super();
		this.shopid = shopid;
		this.Brand = brand;
		this.price =price;
		shopid = shopid;

	}


	public String getBrand() {
		return Brand;
	}


	public void setBrand(String brand) {
		Brand = brand;
	}


	public Integer getPrice() {
		return price;
	}


	public void setPrice(Integer price) {
		this.price = price;
	}


	
}
