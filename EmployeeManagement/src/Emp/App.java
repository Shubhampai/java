package Emp;

public class App {

	public static void main(String[] args) {
		
		//Staff staff1= new Staff();
		//main
		NonTeachingStaff staff1= new NonTeachingStaff(10);
		TeachingStaff staff2 = new TeachingStaff(20);
	
		ProfDesignation prof = new ProfDesignation();
		//ProfDesignation prof2 = new ProfDesignation("Head Clerk");
		ProfDesignation prof3 = new ProfDesignation("Principal", 40);
		
		staff2.CalculateSalary();
		prof3.setName("Dattesh");
		System.out.println("\nName:" +prof3.getName() +"\nDesigntion: " +prof3.getDesignation() +"\nage: " +prof3.getAge());
	
		staff1.CalculateSalary();
		staff1.setName("Shubham");
		System.out.println("Name: " +staff1.getName() );
		System.out.println("Working Hours of Non Teaching Staff: " +staff1.getAdminhours() +"\nDesignation: " +prof.getDesignation());
		
		System.out.println("Shubahms Hours: " +prof.getNoOfTeachingHours());
		
		
		staff2.CalculateSalary();
		staff2.setName("Joseline");
		System.out.println("Name: " +staff2.getName());
	//	System.out.println("Working Hours of Teaching Staff: " +staff2.getNoOfTeachingHours() +"\nDesignation: " +prof2.getDesignation());
		

		
	}

		
	
	
}
