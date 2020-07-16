package com.lams1989.repeatedstring;

import junit.framework.TestCase;

public class RepeatedStringTest extends TestCase {

	public static void test1() {
		String s = "aba";
		int n = 10;

		int a = RepeatedString.repeatedString(s, n);

		assertEquals(8, a);
	}
	public static void test2() {
		String s = "aba";
		int n = 10;

		int a = RepeatedString.repeatedString(s, n);

		assertEquals(8, a);
	}
	public static void test3() {
		String s = "lacra";
		int n = 50;

		int a = RepeatedString.repeatedString(s, n);

		assertEquals(20, a);
	}
	public static void test4() {
		String s = "ella";
		int n = 34;

		int a = RepeatedString.repeatedString(s, n);

		assertEquals(9, a);
	}
	
}
