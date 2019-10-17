package com.peter.algo;

import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
		int a = 100;
		int b = 50;
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
}
