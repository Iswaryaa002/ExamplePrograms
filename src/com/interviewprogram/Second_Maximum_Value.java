package com.interviewprogram;

public class Second_Maximum_Value {

	public static void main(String[] args) {
		
		int a[] = {3,6,5,8,7,5,9};
		
		int first= 0;
		int second = 0;
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]>first) {
				
				second = first;
			first=a[i];
			
			}
		}
		System.out.println("First Max Number" +first);	
		System.out.println("Second Max Number" +second);
		}
	}

