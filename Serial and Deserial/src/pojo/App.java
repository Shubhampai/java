package pojo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {

	public static void main(String args[]) {
		Serial();
		Deserial();
	}	
	
	
	public static void Serial() {
		
		
		FileOutputStream fout =null;
		ObjectOutputStream oout = null;
		
		try {
			fout = new FileOutputStream(new File("Student.txt"));
			oout = new ObjectOutputStream(fout);
			Student s =new Student("Shubham", "Male", 21, 12);
			oout.writeObject(s);
			
			
		} 
		catch (Exception e) {
		
			e.printStackTrace();
		}
		finally {
			try {
				fout.close();
				oout.close();
			} 
			
			catch (IOException e2) {
				
				e2.printStackTrace();
			}
			
		}
		
		
	}
	
	
	public static void Deserial() {
		
		FileInputStream fin = null;
		ObjectInputStream oin =null;
		
		try {
			fin = new FileInputStream(new File("Student.txt"));
			oin = new ObjectInputStream (fin);
			Student s =(Student) oin.readObject();
			System.out.println("Name: " +s.getName() + "\nGender" +s.getGender() +"\nAge: " +s.getAge() +"\nStandard: " +s.getStandard());
			
			
		} 
		catch (Exception e) {
		
			e.printStackTrace();
		}
		finally {
			try {
				fin.close();
				oin.close();
			} 
			
			catch (IOException e2) {
				
				e2.printStackTrace();
			}
			
		}
		
	}
	
	}

