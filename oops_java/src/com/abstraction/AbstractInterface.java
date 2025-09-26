package com.abstraction;

	class Car implements vehicle{
		
		@Override
		public void start() {
			System.out.println("Car class start method");
		}
		
		
		@Override
		public void stop() {
			System.out.println("Car class stop method");
		}
	}
public class AbstractInterface {
	public static void main(String[] args) {
	Car c= new Car();
	c.start();
	c.stop();
	vehicle.display();
	}
}
