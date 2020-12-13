package edu.smg;

import java.util.Scanner;

public class TestGeometricObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(1);
		System.out.println("A circle " + circle.toString());
		System.out.println("The color is " + circle.getColor());
		System.out.println("The radius is " + circle.getRadius());
		System.out.println("The area is " + circle.getArea());
		System.out.println("The diameter is " + circle.getDiameter());
		Rectangle rectangle = new Rectangle(2, 4);
		System.out.println("\nA rectangle " + rectangle.toString());
		System.out.println("The area is " + rectangle.getArea());
		System.out.println("The perimeter is " + rectangle.getPerimeter());
		Scanner sc = new Scanner(System.in);
		Triangle triangle = new Triangle();
		System.out.println("\nSide 1: ");
		triangle.setSide1(sc.nextDouble());
		System.out.println("Side 2: ");
		triangle.setSide2(sc.nextDouble());
		System.out.println("Side 3: ");
		triangle.setSide3(sc.nextDouble());
		sc.nextLine();
		System.out.println("Color: ");
		triangle.setColor(sc.nextLine());
		System.out.println("Filled: ");
		triangle.setFilled(sc.nextBoolean());
		System.out.println(triangle.printTriangle());
		System.out.println(triangle.toString());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Area: " + triangle.getArea());
		sc.close();
	}

}
