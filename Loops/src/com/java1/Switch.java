package com.java1;
import java.util.*;
public class Switch {

	public static void main(String[] args) {

	    int number = 0;
        Scanner sc=new Scanner(System.in);
	    System.out.printf("Enter a positive integer number: ");
	    number = sc.nextInt();

	    switch (number % 2) {
	    case 0:
	      System.out.printf("%d is an EVEN number.\n", number);
	      break;

	    case 1:
	      System.out.printf("%d is an ODD number.\n", number);
	      break;
	    }

	}

}
