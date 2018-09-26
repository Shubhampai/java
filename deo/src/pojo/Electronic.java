package pojo;

public class Electronic extends Shopping implements Platform{

	private String Brand;
	private Integer price;
	private Integer a,b=900;
	
	
	public Electronic(Integer shopid,String brand,Integer price) {
		super();
		this.shopid = shopid;
		this.Brand = brand;
		this.price =price;
		shopid = shopid;

	}
	public Electronic() {
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
	
	@Override
	public void Payment() {
		
		a = b * price;
		
		System.out.println("Price: "+a);
		
	
	}
	
}
