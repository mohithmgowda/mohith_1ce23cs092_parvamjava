package com.funcaion;

public class functioninjava {
	public int add(int num1, int num2) {
		return num1+num2;
	}
	public static void main(String[] args) {
		functioninjava obj1=new functioninjava();
		int res =obj1.add(10, 20);
		System.out.println("res:" +res);
		int res1=obj1.add(100, 200);
		System.out.println(+res);
		System.out.println(+res1);
	}
}
