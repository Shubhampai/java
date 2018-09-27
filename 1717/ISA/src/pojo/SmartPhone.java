package pojo;

public abstract class SmartPhone extends Mobile implements OsIndependent {

	private String name;
	private Integer rsize;
	private String sim;
	protected String osname;
	
	
	public SmartPhone(Integer imei, String name, Integer rsize, String sim, String osname) {
		super(imei);
		this.name = name;
		this.rsize = rsize;
		this.sim = sim;
		this.osname = osname;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getRsize() {
		return rsize;
	}


	public void setRsize(Integer rsize) {
		this.rsize = rsize;
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


	


	@Override
	public void Osname2() {
		System.out.println("\nOS Independent\n");
		System.out.println("OS Supported: " +osname);
		
	}


	@Override
	public void Processor() {
		Integer a = rsize * 2500;
		System.out.println("\nProcessor Speed: " +a);
		
	}


	@Override
	public void Expiry() {
	Integer b = (rsize * 25 )/10;
	System.out.println("Expiry Period: " +b);
		
	}
	
}
