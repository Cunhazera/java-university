package com.intro.java;

public class FirstToSecond {

	public static void main(String[] args) {
		String numberOne = args[0];
		String numberTwo = args[1];
		
		int numberOneDouble = Integer.parseInt(numberOne);
		int numberTwoDouble = Integer.parseInt(numberTwo);
		
		if (numberOneDouble > numberTwoDouble) {
			System.out.println("The first can not be greater than the second!");
		} else {
			for (int i = numberOneDouble; i <= numberTwoDouble; i++) {
				System.out.println(i);
			}
		}
	}

}
