package com.loops;

import java.util.Scanner;

public class forloop {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number:");
	int size =sc.nextInt();
	if (size <=0) {
		System.out.println("invalid number");
	}for(int i=1;i<=size;i++) {
		if(i%2==0) {
			System.out.println(i+"even");
		}else {
			System.out.println(i+"odd");
			sc.close();
		}
	}
	
}
}