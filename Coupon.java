package com.coupon;

public class Coupon {

	public static void main(String[] args) {
		char arr[]= {'a','b','c','d','e','f','g','h','1','2','3','4','7','8','A','B','C'};
		 char[] d = new char[arr.length];
		int random2= (int) (Math.random() * 10) % 6 + 3;
	      for(int i=0; i<=random2; i++) {
	    	  int random= (int) (Math.random() * 10) % 17 + 1;
	    	  d[i]=arr[random];
	      }
              System.out.println( d);	     
	}

}
