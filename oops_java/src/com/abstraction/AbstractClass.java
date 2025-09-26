package com.abstraction;

abstract class shape {
	abstract void draw();
	public void display() {
		System.out.println("this is Display Function ");
		
	}
}

class Circle extends shape{
	
@Override
void draw() {
	System.out.println("This is shape draw method");
}
}
public class AbstractClass{
	public static void main(String[]arg) {
		Circle circle =new Circle();
		circle.draw();
		circle.display();
	}
}






