package co.grandcircus;

public class Circle {

	double pi = Math.PI;
	double radi;;
	double area;
	double circumference;
	boolean isValid = true;

	public Circle(double radius) {
		radi = radius;

	}

	public double getCircumference() {
		circumference = (2 * radi * pi);
		return circumference;
	}

	public double getArea() {
		area = pi * (radi * radi);
		return area;

	}

	private static String formatNumber(double x) {
		return String.format("%.2f", x);

	}

	public String getFormattedCircumference() {
		return formatNumber(circumference);
	}

	public String getFormattedArea() {
		return formatNumber(area);
	}
}
