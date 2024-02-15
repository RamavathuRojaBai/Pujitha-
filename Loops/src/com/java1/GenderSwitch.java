package com.java1;
import java.util.*;
public class GenderSwitch {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
	    char gender;

	    System.out.printf("Enter gender (M/m or F/f): ");
	    gender = Sc.next().charAt(0);

	    switch (gender) {
	    case 'M':
	    case 'm':
	      System.out.printf("Male.");
	      break;

	    case 'F':
	    case 'f':
	      System.out.printf("Female.");
	      break;

	    default:
	      System.out.printf("Unspecified Gender.");
	    }
	    System.out.printf("\n");

	}
}
