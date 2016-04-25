package crystal.dealer.pro.reflection.shapes;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import crystal.dealer.pro.reflection.Shape2D;

public class Triangle implements Shape2D{

	private Point v1, v2, v3;
	
	private double a, b, c;
	
	private Triangle(){
		
	}
	
	private Triangle(Point v1, Point v2, Point v3){
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
		calculateSideLengths();
	}
	
	private void calculateSideLengths(){
		a = v1.distance(v2);
		b = v1.distance(v3);
		c = v2.distance(v3);
	}
	
	public static Triangle createTriangle(Point v1, Point v2, Point v3){
		return new Triangle(v1, v2, v3);
	}
	
	@Override
	public double getField() {
		double p = ((a + b + c)/2.0);
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}

	@Override
	public void draw() {
		System.out.println("DRAWING TRIANGLE.");
		System.out.println(this.toString());
		
	}

	@Override
	public int getVerticiesNumber() {
		return 3;
	}

	@Override
	public List<Point> getVertices() {
		List<Point> list = new ArrayList<Point>();
		list.add(v1);
		list.add(v2);
		list.add(v3);
		return list;
	}

	
	@Override
	public String toString() {
		return "Triangle [field=" + getField() + ", a=" + a
				+ ", b=" + b + ", c=" + c + "]";
	}

	public void trian(){
		System.out.println("TRIANGLE SPECIFIC METHOD INVOKED!");
	}
	
}
