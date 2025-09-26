package com.loops;

import java.util.Scanner;
public class dowhile {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer:");
    int s = sc.nextInt();

    if (s < 0) {
        System.out.println("Enter a positive value");
        sc.close();
        return; 
    }

    int i = 0;
    do {
        if (i % 2 == 0) {
            System.out.println(i + " is an even number");
        } else {
            System.out.println(i + " is an odd number");
        }
        i++;
    } while (i <= s);

    sc.close();
}
}

