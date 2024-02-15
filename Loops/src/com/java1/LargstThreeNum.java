package com.java1;

public class LargstThreeNum {

	public static void main(String[] args) {
		int n1 =6, n2 = 5, n3 = 4;

        if(n1 >= n2) {
            if(n1 >= n3)
                System.out.println(n1 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");
        } 
        else {
            if(n2 >= n3)
                System.out.println(n2 + " is the largest number.");
            else
                System.out.println(n3 + " is the largest number.");

	}
	}
}
