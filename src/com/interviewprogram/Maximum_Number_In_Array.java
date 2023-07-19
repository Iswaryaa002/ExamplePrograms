package com.interviewprogram;

public class Maximum_Number_In_Array {
	
	public static void main(String[] args) {
		
		
		int a[] = {2,5,7,9};
		int max= 0;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>max) {
				
				
				 max =a[i];
			}
		}
		System.out.println("Maxinum Number"+max);
		
	}

}
