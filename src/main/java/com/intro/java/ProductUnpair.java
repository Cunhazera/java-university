package com.intro.java;

public class ProductUnpair {

	public static void main(String[] args) {
		int product = 1;
		for (int i = 1; i <= 15; i++) {
			if ((i % 2) != 0) {
				System.out.println(i);
				product *= i;
			}
		}
		System.out.println(product);
	}
}