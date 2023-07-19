package com.interviewprogram;

public class Reverse_The_String {
	
	public static void main(String[] args) {
		 String r ="Aishwarya";
		 String rev = " ";
		 
		 for(int i = r.length()-1;i>=0;i--) {
			 rev = rev+r.charAt(i);
		 }
		 System.out.println(rev);
			
		}
	}


