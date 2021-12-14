package com.prime;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		 Prime ch=new Prime();
		 ch.check(num);
		 
	}
		 public void check(int num) {
			 boolean check=false;
			 for (int i=2; i<=num/2; i++) {
				 if(num%i==0) {
					 System.out.println(num+ " is not a prime number");
					 check=true;
					 System.exit(0);
				 }
			 }
			 if(check==false)
			 System.out.println(num+ " is a prime number");    
	}

}
