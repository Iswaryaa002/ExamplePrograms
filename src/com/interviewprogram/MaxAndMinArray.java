package com.interviewprogram;

public class MaxAndMinArray {
	
	public static void main(String[] args) {
		
		int a[] = {5,10,15,20,25,30,35,40};
		
		int max=0;
		 int min = a[0];
		 
	 for (int i = 0; i < a.length; i++) {
		 
		 if(a[i]>max) {
			 max=a[i];
		 }
		 else if (a[i]<min) {
			 min =a[i];
		 }
		
	}
	 System.out.println("Maximum Number" +max);
	 System.out.println("Minimum Number" +min);
		
	} 
	
}
