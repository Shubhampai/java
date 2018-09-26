package pojo;

public class Clothing extends Shopping {

	private String Brand;
	private Integer price;
	public Clothing(Integer shopid,String brand,Integer price ) {
		super();
		
		this.shopid = shopid;
		this.Brand = brand;
		this.price =price;
		
	}
	public Clothing() {
		shopid=0;
		Brand="";
		price=0;
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
