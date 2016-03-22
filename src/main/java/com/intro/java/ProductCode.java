package com.intro.java;

import java.util.Scanner;

public class ProductCode {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String price = getInfoFromUser(scanner, "Tell the product price: ");
		String code = getInfoFromUser(scanner, "Tell the code: ");

		double priceDouble = Double.parseDouble(price);
		int codeInt = Integer.parseInt(code);

		switch (codeInt) {
		case 1:
			priceDouble += 15 * priceDouble / 100;
			System.out.println("Preço com acréscimo é: " + priceDouble);
			break;

		case 3:
			priceDouble += 20 * priceDouble / 100;
			System.out.println("Preço com acréscimo é: " + priceDouble);
			break;

		case 4:
			priceDouble += 35 * priceDouble / 100;
			System.out.println("Preço com acréscimo é: " + priceDouble);
			break;

		case 8:
			priceDouble += 40 * priceDouble / 100;
			System.out.println("Preço com acréscimo é: " + priceDouble);
			break;

		default:
			System.out.println("Valor de código informado não está nas opções");
			break;
		}
	}

	private static String getInfoFromUser(Scanner scanner, String message) {
		System.out.println(message);
		return scanner.next();
	}

}
