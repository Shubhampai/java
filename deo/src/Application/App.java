package Application;

import pojo.Clothing;
import pojo.Electronic;
import pojo.Shopping;
import java.util.ArrayList;
public class App {

	public static void main(String[] args) {
	Clothing c1 = new Clothing(101,"Killer", 10000);
	
	Shopping s1 = new Clothing(201, "Caprisi", 74843);
	
	Clothing s2 = new Clothing();
	s2.setShopid(111);
	s2.setBrand("Gucci");
	s2.setPrice(2276);

	
	Electronic e1 = new Electronic(290, "iphone", 281492);
	
	ArrayList<String>list = new ArrayList<String>(4);
	list.add("HI");
	list.add("Welcome");
	list.add("Subham Pai");
	for(String x : list)
		System.out.println(x +" \n");
	
	
	System.out.println("Clothing:\n" +"SHOP ID: " +c1.getShopid() +"\nBrand: " +c1.getBrand() +"\nPrice: " +c1.getPrice());
	System.out.println( "\n\nSHOP ID: " +s1.getShopid() +"\nBrand: " +s1.getBrand() +"\nPrice: " +s1.getPrice() );
	System.out.println( "\n\nElectronic: " +"\nSHOP ID: "+e1.getShopid() +"\nBrand: " +e1.getBrand() +"\nPrice: " +e1.getPrice() );
	e1.Payment();

	}
}
