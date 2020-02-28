package com.revature.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Driver {
	
	private ArrayList<Rock> rocks = new ArrayList<>();

	public static void main(String[] args) {
		
		Driver d = new Driver();
		
//		d.rocks.add(new Rock(3, "Quartz", 3.45, Color.Grey, "Crystalline"));
		
//		d.serialize();
		
		d.deserialize();
		
		System.out.println(d.rocks);
	}
	
	public void serialize() {
		
		// try-with-resources will automatically close the resource at the end
		// We have access to this resource in the try-catch-finally block
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("files/rocks.db"))) {
			
			oos.writeObject(rocks);
			
		} catch (IOException e) {
//			e.printStackTrace();
		}
	}

	public void deserialize() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("files/rocks.db"))) {
			
			rocks = (ArrayList<Rock>) ois.readObject();
			
		} catch(IOException e) {
		} catch(ClassNotFoundException e) {
		}
	}
}
