package com.datatypes;

import java.util.Scanner;

public class userinput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int userinput;
		System.out.println("Enter the number: ");
		userinput=sc.nextInt();
		System.out.println("You enetred value is :"+userinput);
		
		long marks;
		marks=sc.nextLong();
		System.out.println("Your marks" +marks);
		
		sc.close();
	}

}
