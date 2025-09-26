package com.conditional;

import java.util.Scanner;

public class oddeven {
	
	public static void main(String[] args) {
		
	
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number:");
			int x=sc.nextInt();
			if(x==0) {
				System.out.println("The given number:"+x+" is zero");
				
			}
			else if(x<0) {
				System.out.println("The given number:"+x+" is -ve");
				
			}
			else if(x%2==0) {
				System.out.println("The given number:"+x+" is even");
			
			
		}
			else{
				System.out.println("The given number:"+x+" is odd");

	}
			sc.close();
		}
	}