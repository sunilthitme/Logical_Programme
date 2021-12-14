package com.sum;
import java.util.Scanner;
public class SumPositive {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		 int z=0;
           for(int i=1;i<=num/2;i++) {
        	  if(num%i==0) {
        		  System.out.print(i+" ");
        		  z=z+i;
        	  }
        	   
           }
	      if(z==num) {
	    	  System.out.println("\n"+num+" is a perfect number");
	    	  
	      }
	      else {
	    	  System.out.println(num+" not a perfect number");
	      }
	}

}
