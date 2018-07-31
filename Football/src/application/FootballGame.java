package application;

import pojo.Player;
import pojo.Refree;
import pojo.Substitutes;

public class FootballGame {

	public static void main(String[] args) {
		
		/*Player goalkeeper = new Player();
		
		Player striker = new Player("Ronaldo", 34,"Male");
		System.out.println("striker : " + striker.getName() +" " +striker.getAge() +" " + striker.getGender() );
		
		goalkeeper.setAge(50);
		goalkeeper.setName("SHubham");
		System.out.println(" Goalkeeper-->" + goalkeeper.getAge()+" " +goalkeeper.getName());
			
		Refree ref = new Refree("Dattesh", 20);
		System.out.println("Refree : " +ref.getName() +" " +ref.getAge() );
		
		Goalkeeper goal = new Goalkeeper("Gayu", 21, "Female");
		System.out.println("goalkeer details " +goal.getName() +" "  +goal.getAge() +" " +goal.getGender()  );*/
		
		
		Player s1 = new Player("Shubham", 21, "Male", 20);
		Substitutes s2 = new Substitutes("Dattesh ", 20);
		
		System.out.println("Name: " +s1.getName() +"\nAge: " +s1.getAge() +"\nGender: " +s1.getGender() +"\nGoals: " +s1.getGoals() );
		s1.Calculatesalary();
		System.out.println("\n\n");
		Player s3 =new Player();
		s3.setName("Josline");
		s3.setGender("\nFemale");
		
		System.out.println("Player s3: " +s3.getName() +"" +s3.getGender());
		
		System.out.println("\n\n");
		//for substitute
		System.out.println("The Substitute: " +s2.getName() +"" +s2.getGender() +"" );
		s2.Payment(); System.out.println("2000000");
		
		Refree r1 = new Refree("Viru", 30, 34);
		System.out.println("\nName: " +r1.getName() +"\nAge: " +r1.getAge() +"\nMatches: " +r1.getMatches());
		r1.Calculatesalary();
		
		}
	//
	}//main


