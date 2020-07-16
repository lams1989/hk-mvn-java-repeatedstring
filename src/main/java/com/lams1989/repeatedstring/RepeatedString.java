package com.lams1989.repeatedstring;

public class RepeatedString {
	public static long repeatedString(String s, long n) {
		long count = 0;
		char a = 97;
		String aux = "";
		if (!s.contains("a")) {
			return 0;
		}
		while (aux.length() < n) {

			aux += s;
		}
		for (long i = 0; i < n; i++) {
			if (aux.charAt((int) i) == a) {
				count++;
			}
		}

		System.out.println(aux);
		return count;
	}
	
	static long repeatedString2(String s, long n) {

	    int i=0;
	    long count = 0;

	    for(i=0; i<s.length(); i++){
	        if(s.charAt(i) == 'a')
	            count++;
	    }

	    long div = n/s.length();
	    long aux = n%s.length();

	    count = div*count;

	    for(i=0; i<aux; i++){
	        if(s.charAt(i) == 'a')
	            count++;
	    }

	return count;
	}
}
