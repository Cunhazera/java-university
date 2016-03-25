package com.intro.java;

public class TableInfo {

	public static void main(String[] args) {
		String valueOne = args[0];
		String valueTwo = args[1];
		String valueThree = args[2];

		double hoursWorked = Double.parseDouble(valueOne);
		double salaryForHour = Double.parseDouble(valueTwo);
		double numberOfDependents = Double.parseDouble(valueThree);

		double brutalSalary = hoursWorked * salaryForHour + (50 * numberOfDependents);
		double inssDiscount = 0;
		double irDiscount = 0;
		double liquidalSalary = 0;

		if (brutalSalary <= 500) {
			irDiscount = 0;
		} else if (brutalSalary > 500 && brutalSalary <= 1000) {
			irDiscount = brutalSalary * 5 / 100;
		} else {
			irDiscount = brutalSalary * 7 / 100;
		}

		if (brutalSalary <= 1000) {
			inssDiscount = brutalSalary * 8.5 / 100;
		} else {
			inssDiscount = brutalSalary * 9 / 100;
		}

		liquidalSalary = brutalSalary - inssDiscount - irDiscount;

		System.out.printf("The 'brutal' salary is $%.2f\n",  brutalSalary);
		System.out.printf("The INSS discount is $%.2f\n", inssDiscount);
		System.out.printf("The IR discount is $%.2f\n", irDiscount);
		System.out.printf("The liquidal salary is $%.2f\n", liquidalSalary);

	}

}
