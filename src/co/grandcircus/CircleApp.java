package co.grandcircus;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double radius = 0;
		double checkRadius;
		String cont;

		do {

			System.out.println("Welcome to the Circle data calculator.");

			System.out.println("Enter a radius: ");
			checkRadius = scnr.nextDouble();

			if (checkRadius <= 0) {
				System.out.println("Number must be greater than 0");
			} else {
				radius = checkRadius;
			}

			Circle objectCircle = new Circle(radius);

			objectCircle.getCircumference();
			objectCircle.getArea();

			System.out.println("Circumference: " + objectCircle.getFormattedCircumference());
			System.out.println("The area of the circle is: " + objectCircle.getFormattedArea());
			System.out.println("Do you want to continue? (y/n)");
			cont = scnr.nextLine();

		} while (cont.toLowerCase().startsWith("y"));

		System.out.println("Goodbye!");
		scnr.close();

	}

}