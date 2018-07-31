package Staffemp;

public class ContractTeacher extends TeachingStaff implements DailyWage{

	private Integer plectures,mlectures, d=800,a,b;
	
	

	public ContractTeacher(Integer plectures, Integer mlectures, String name) {
		super(name);
		this.plectures = plectures;
		this.mlectures = mlectures;
		this.name = name;
	}

	@Override
	public void CalculateSalary() {
	
		b = mlectures * d;
		System.out.println("Payment Monthly: " +b);
	}

	@Override
	public void DailyCalculations() {
			a = plectures * d;
			
			System.out.println("Payment per day: " +a);
																												
	}

}
