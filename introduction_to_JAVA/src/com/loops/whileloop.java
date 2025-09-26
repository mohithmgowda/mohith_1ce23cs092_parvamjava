package com.loops;

import java.util.Scanner;
		public class whileloop {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("enter number:");
				int size =sc.nextInt();
				if (size <=0) {
					System.out.println("invalid number");
				}
				int i = 1;
				while(i<=size) {
					if(i%2==0) {
						System.out.println(i+"even");
					}else {
						System.out.println(i+"odd");
					}
					i++;
					sc.close();
				}
			}

		}