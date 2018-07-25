package CAT;

public class App {

	public static void main (String[] args) {
		//main
		Women_cloth w1 = new Women_cloth(3200, "pepe", "Jeans");
		w1.setId(21021);
		System.out.println("ID: " +w1.getId() +"\nItem: " +w1.getItem_name() +"\nCatgeory: " +w1.getCategory() );
		
		w1.DepCat();
		
		System.out.println("\n\n");
		
		
		Computer c1 = new Computer(20000,"Acer", "Laptop");
		c1.setId(6151);
	
		System.out.println("ID: " +c1.getId() +"\nItem: " +c1.getItem_name() +"\nCatgeory: " +c1.getCategory_name());
		c1.DepCat();
		
	}
	
}
