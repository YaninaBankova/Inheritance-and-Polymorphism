package edu.smg;

public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
		setSide1(1);
		setSide2(1);
		setSide3(1);
	}
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	public double getArea() {
		return Math.sqrt(getPerimeter() * (getPerimeter() / 2 - side1) * (getPerimeter() / 2 - side2) *(getPerimeter() / 2 - side3) / 2);
	}
	public String printTriangle() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
