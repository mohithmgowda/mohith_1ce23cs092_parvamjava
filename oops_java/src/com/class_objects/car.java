package com.class_objects;

public class car {
	String brand;
	int year;
	public void display() {
		System.out.println("BRAND : "+brand);
		System.out.println("YAR : "+year);		
	}
}

public class ClassObject{
	public static void main(String[] args) {
		var obj1=new car();
		obj1.brand="tesla";
		obj1.year=2017;
		obj1.display();
		car obj2=new car();
	}
}
