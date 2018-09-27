package pojo;

public class FeatureBasic extends FeaturePhone implements Community {
	
	private String type;
	private Integer ComUser;
	private Integer price;
	
	
	public FeatureBasic(Integer imei, String name, String sim, String type, Integer exdate , Integer ComUser, Integer price) {
		super(imei, name, sim, type, ComUser);
		this.imei = imei;
		this.name = name;
		this.sim = sim;
		this.type = type;
		this.exdate = exdate;
		this.ComUser = ComUser;
		this.price = price;
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getComUser() {
		return ComUser;
	}

	public void setComUser(Integer comUser) {
		ComUser = comUser;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public void OSName() {
		System.out.println("OS Name: Symbian");
		
	}

	@Override
	public void CommunityInfo() {
		Integer c = ( ComUser *100 )/ 10;
		System.out.println("Toatal Community User: " +c);
		
		
	}

	
}
