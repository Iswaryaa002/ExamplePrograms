package com.interviewprogram;

public class Minimum_Number_In_Array {
	
	public static void main(String[] args) {
		
		int a[] = {2,4,6,8,10,12,14};
		
		int min = a[0];
		
	  for (int i = 0; i < a.length; i++) {
		  
		  if(a[i]<min) {
			  min = a[i];
		  }
		}
	  System.out.println("Maximum Number" +min);
		
	}

}
