package lab4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		BMI bmi;
		double weight, height;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter weight in pounds: ");
		weight = scanner.nextDouble();
		System.out.print("Enter height in inches: ");
		height = scanner.nextDouble();

		bmi = new BMI(weight, height);

		System.out.println("BMI is " + bmi.getBMI() + "\n" + bmi.getHealthStatus());

		scanner.close();
	}

}
