package com.peter.algo;

public class CenterOfString {
	
	public static void main(String[] args) {
		String s = "abcde";
//		String s = "qwer";
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
		int n = s.length();
		if(n % 2 == 1) 	return s.substring((n-1)/2, (n+1)/2);
		else 			return s.substring(n/2 - 1, n/2 + 1);
	}
}
