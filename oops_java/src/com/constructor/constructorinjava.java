package com.constructor;
class student{
	public int id;
	public String name;
	public student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public student(int id) {
		super();
		this.id = id;
	}
	
}
public class constructorinjava {
	public static void main(String[] args) {
		student s1=new student(101,"RAJA");
		student s2=new student(102,"RANI"
				+ "");
		System.out.println("First Student:");
		System.out.println("ID:"+s1.id);
		System.out.println("NAME:"+s1.name);
		System.out.println("SECOND STUDENT:");
		System.out.println("ID:"+s2.id);
		System.out.println("name:"+s2.name);
	}

}