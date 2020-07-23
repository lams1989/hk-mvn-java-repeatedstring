package com.lams1989.repeatedstring;

import junit.framework.TestCase;

public class RepeatedStringTest extends TestCase {

	public static void test1() {
RepeatedString read = new RepeatedString();
		
    	String s = "a";
		long n = 10000000000000000L;

		assertEquals(67,read.repeatedString2(s, n));

		
	}
	public static void test2() {
		RepeatedString read = new RepeatedString();

		String s = "alaba";
		long n = 10;

		assertEquals(6,read.repeatedString2(s, n));

		
	}
	public static void test3() {
		RepeatedString read = new RepeatedString();

		String s = "lacra";
		long n = 50;

		assertEquals(20, read.repeatedString2(s, n));
	}
	public static void test4() {
		RepeatedString read = new RepeatedString();

		String s = "ella";
		long n = 134;

		assertEquals(33, read.repeatedString2(s, n));
	}
	
}
