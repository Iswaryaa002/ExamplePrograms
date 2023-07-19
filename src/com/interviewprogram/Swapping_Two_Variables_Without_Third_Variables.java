package com.interviewprogram;

public class Swapping_Two_Variables_Without_Third_Variables {
	
	public static void main(String[] args) {
		
		int a = 90;
		int b = 80;
		
		a= a+b;
		b= a-b;
		a= a-b;
		
		System.out.println(a);
		System.out.println(b);
	}

}
