package pojo;

public class FeatureRich extends FeaturePhone implements Proprietary{
	
	private String Feature;
	
	public FeatureRich(Integer imei, String name, String sim, String Feature) {
		super(imei, name, sim, Feature, imei);
	
		this.imei = imei;
		this.name = name;
		this.sim = sim;
		this.Feature = Feature;
		
		
	}

	public String getFeature() {
		return Feature;
	}

	public void setFeature(String feature) {
		Feature = feature;
	}

	@Override
	public void Ownerinfo() {
		System.out.println("Company Name: Star Treck\n");
		
	}

	
}
