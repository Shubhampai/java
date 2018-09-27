package application;

import pojo.FeatureBasic;
import pojo.FeaturePhone;
import pojo.FeatureRich;
import pojo.Multiform;
import pojo.SmartPhone;
import java.util.ArrayList;

public class App {
	
public static void main(String[] args) {
	/*
	 *Name	: Shubham Pai 
	 *RollNo: 1717
	 * 
	 */
	
	//array list for smart phones
	ArrayList< Multiform> mylist = new ArrayList<>();
	mylist.add(new Multiform(434343, "Iphone", 3, "Single", "IOS", "Cellphone", 59000));
	mylist.add(new Multiform(132412, "OnePlus", 6, "Dual", "Android Nougut", "Tablet", 60000));
	mylist.add(new Multiform(514234, "MI", 4, "Dual", "Android Oreo", "Laptop", 78000));
	mylist.add(new Multiform(434343, "Nokia", 5, "Single", "Android Mareshmello", "Cellphone", 90000));
	mylist.add(new Multiform(434343, "Iphone 6s", 1, "Single", "IOS", "Cellphone", 29000));
	
	System.out.println("\nList Of SmartPhones Mobile:\n");
	for(Multiform j:mylist) {
		System.out.println("IMEI: " +j.getImei() +"\nName: " +j.getName() +"\nRam Size: " +j.getRsize() +"\nSim: " +j.getSim() +"\nCurrent OS Running: "
				
				+j.getOsname() +"\nType: " +j.getType() +"\nPrice: " +j.getPrice());
		j.Expiry();
		System.out.println("=========================");
	}
//Array list for feature phones
	ArrayList<FeatureBasic> mylist2 = new ArrayList<>();
	mylist2.add(new FeatureBasic(132234, "Nokia", "Single", "Cellphone", 3, 100,2000));
	mylist2.add(new FeatureBasic(132234, "Realme", "Dual", "Cellphone", 5, 340,1400));
	mylist2.add(new FeatureBasic(132234, "Micromax", "Four", "Cellphone", 7, 670,4231));
	
	System.out.println("\nList Of All Feature Mobile:\n");
	for(FeatureBasic i: mylist2) {
		System.out.println("IMEI: " +i.getImei() +"\nName: " +i.getName() +"\nSim: " +i.getSim() +"\nType: " +i.getType() +"\nPrice: " +i.getPrice());
		i.Expiry();
		i.CommunityInfo();
		System.out.println("=========================");
	}//for
	
	
}//main	

}
//class