package com.fibonacci;
import java.util.Scanner;
public class FibonaciiSeries {

	public static void main(String[] args) {
				System.out.println("Enter the number");
				Scanner sc=new Scanner(System.in);
				 int num=sc.nextInt();
				 int a=0, b=1, c;
					
				for(int i=0;i<num;i++) {
					c=a+b;
					System.out.print(c+",");
					a=b;
					b=c;
				}
				 
			}

}
	
	
	
