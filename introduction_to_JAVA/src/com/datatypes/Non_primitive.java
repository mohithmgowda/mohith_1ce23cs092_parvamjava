package com.datatypes;

import java.util.Arrays;

public class Non_primitive {
	public static void main(String[] args) {
	String name1="Sadeeq";
	System.out.println("NAME: " +name1);
	int[] arr= {25,14,0,2,3};
	System.out.println("MARKS: "+Arrays.toString(arr));
	for(int i=0;i<5;i++) {
		System.out.println(arr[i]);
	}
}
}
