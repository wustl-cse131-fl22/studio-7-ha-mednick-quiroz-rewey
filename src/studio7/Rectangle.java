package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double width;
	private double length;
	
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public void setLength(double a) {
		length = a;
	}
	public void setWidth(double a) {
		width = a;
	}
	
	public double getArea() {
		double area = length*width;
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = (2*length) + (2*width);
		return perimeter;
	}

	public void main(String[] args) {
		// TODO Auto-generated method stub
		setWidth(.3);
		setLength(.4);
		
		StdDraw.filledRectangle(.5, .5, .5*getWidth(), .5*getLength());

	}

}
