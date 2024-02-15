package com.java1;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n,rev=0,rem=0,temp=0;
        n=sc.nextInt();
     while(n>0)
     {
    	 rem=n%10;
    	 rev=rev*10+rem;
    	 n=n/10;
     }
     if(temp==rev)
     {
    	 System.out.println(temp);
     }
	}

}
