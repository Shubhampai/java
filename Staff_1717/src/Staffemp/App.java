package Staffemp;

public class App {
public static void main(String[] args){
	
	ContractTeacher s1 = new ContractTeacher(2, 13,"shubham");
	
	System.out.println("Name: " +s1.name);
	
	
	s1.DailyCalculations();
	
	s1.CalculateSalary();
	
	
}
	
	
}
