package pojo;

public abstract class FeaturePhone extends Mobile implements OsDependent {
	
	protected String name;
	protected String sim;
	protected String osname;
	protected Integer exdate;
	
	public FeaturePhone(Integer imei, String name, String sim, String osname, Integer exdate) {
		super(imei);
		this.name = name;
		this.sim = sim;
		this.osname = osname;
		this.exdate = exdate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSim() {
		return sim;
	}

	public void setSim(String sim) {
		this.sim = sim;
	}

	public String getOsname() {
		return osname;
	}

	public void setOsname(String osname) {
		this.osname = osname;
	}

	@Override
	public void Osname() {
		System.out.println("OS Dependent\n");
		System.out.println("OS Supported: " +osname);
		
	}

	public Integer getExdate() {
		return exdate;
	}

	public void setExdate(Integer exdate) {
		this.exdate = exdate;
	}

	@Override
	public void Processor() {
	System.out.println("Runs on C214K4 Processor ");
	}

	@Override
	public void Expiry() {
		Integer b = (exdate * 25 )/10;
		System.out.println("Expiry Period: " +b);
		
	}
	



	
}
