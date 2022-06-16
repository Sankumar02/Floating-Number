package com.Class.org;

import java.util.Scanner;

public class FloatingNumber {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter Number: ");
			double number = input.nextDouble();

			System.out.print((number > 0)
					? (number < 1) ? "Positive small" : (number > 1000000) ? "Positive large" : "Positive Number"
					: (number < 0)
							? (number < 1) ? "Negative small"
									: (number > 1000000) ? "Negative large" : "Negative Number"
							: "Zero");
		}
	}

}
