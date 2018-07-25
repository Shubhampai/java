package Emp;

public class TeachingStaff extends Staff {

		private Integer noOfTeachingHours; 

		public TeachingStaff() {
			
			this.noOfTeachingHours=0;
		}
			
		public TeachingStaff(Integer noOfTeachingHours) {
			super();
			this.noOfTeachingHours = noOfTeachingHours;
		
		}
		
		public Integer getNoOfTeachingHours() {
			return noOfTeachingHours;
		}

		public void setNoOfTeachingHours(Integer noOfTeachingHours) {
			this.noOfTeachingHours = noOfTeachingHours;
		}
		@Override
		public void CalculateSalary() {
			System.out.println("\nTeaching Staff Salary: ");	
		}

	
		
}
