package com.lams1989.repeatedstring;

public class App 
{
    public static void main( String[] args )
    {
    	String s = "a";
		long n = 1000000000000L;

		long a = RepeatedString.repeatedString2(s, n);
		System.out.println(a);
    }
}
