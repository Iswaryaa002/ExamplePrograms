package com.interviewprogram;

public class Reverse_String_With_While {
	public static void main(String[] args) {
		
		String r ="Aishu";
		String rev =" ";
		
		int i = r.length()-1;
		while (i>=0) {
			rev = rev+ r.charAt(i);
			i--;
			
		}
		System.out.println(rev);
	}

}
