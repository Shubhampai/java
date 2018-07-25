package application;

import pojo.Player;
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
		
		
		Player s1 = new Player("Shubham", 21, "male");
		Substitutes s2 = new Substitutes("Dattesh ", 20);

		Player s3 =new Player();
		s3.setName("Josline");
		s3.setGender("\nFemale");
		
		System.out.println("Player s3: " +s3.getName() +"" +s3.getGender());
		
		
		
		
		//for playing player
		System.out.println("The Playimg Player: " +s1.getName() +"\nGender: " +s1.getGender() +"\nAge :" +s1.getAge() );
		s1.Payment();
		
		
		//for substitute
		System.out.println("The Substitute: " +s2.getName() +"" +s2.getGender() +"" );
		s2.Payment(); System.out.println("2000000");
		}
	//
	}//main


