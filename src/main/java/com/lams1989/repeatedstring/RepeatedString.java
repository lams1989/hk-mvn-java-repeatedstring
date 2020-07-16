package com.lams1989.repeatedstring;

public class RepeatedString {
	public static int repeatedString(String s, int n) {
		int count = 0;
		char a = 97;
		String aux = "";

		while (aux.length() < n) {

			aux += s;
		}
		for (int i = 0; i < aux.length(); i++) {
			if (aux.charAt(i) == a) {
				count++;
			}
		}

		System.out.println(aux);
		return count;
	}
}
