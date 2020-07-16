package com.lams1989.repeatedstring;

public class App {
	
	public static void main( String[] args ) {
    	RepeatedString read = new RepeatedString();
		
    	String s = "aba";
		long n = 100;

		System.out.println(read.repeatedString2(s, n));
		
    }
}
