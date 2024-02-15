package com.java6;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		int smallest=0;
        int large=0; 
        int num;

        System.out.println("enter the number");

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
          num=sc.nextInt();
          if(num>large)
          {
           large=num;
          }
          System.out.println("the largest is:"+large);

        }
	}
}

