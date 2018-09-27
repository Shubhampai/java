package pojo;

public abstract class Mobile implements Os {

	protected Integer imei;

	public Mobile(Integer imei) {
		super();
		this.imei = imei;
	}

	public Integer getImei() {
		return imei;
	}

	public void setImei(Integer imei) {
		this.imei = imei;
	}

	@Override
	public void OSName() {
		
		
	}
	
	
}
