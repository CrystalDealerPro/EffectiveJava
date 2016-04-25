package crystal.dealer.pro.reflection.shapes;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import crystal.dealer.pro.reflection.Shape2D;

public class Rectangle implements Shape2D{

	private Point v1, v2, v3, v4;
	
	private double a, b;
	
	private Rectangle(){
		
	}
	
	private Rectangle(Point v1, Point v2){
		this.v1 = v1;
		this.v2 = v2;
		v3 = new Point((int)v1.getX(), (int)v2.getY());
		v4 = new Point((int)v2.getX(), (int)v1.getY());
		a = v1.distance(v3);
		b = v1.distance(v4);
	}
	
	public static Rectangle createRectangle(Point v1, Point v2){
		return new Rectangle(v1, v2);
	}

	@Override
	public double getField() {
		return a*b;
	}

	@Override
	public void draw() {
		System.out.println("DRAWING RECTANGLE.");
		System.out.println(this.toString());
	}

	@Override
	public int getVerticiesNumber() {
		return 4;
	}

	@Override
	public List<Point> getVertices() {
		List<Point> list = new ArrayList<Point>();
		list.add(v1);
		list.add(v2);
		list.add(v3);
		list.add(v4);
		return Collections.unmodifiableList(list);
	}

	@Override
	public String toString() {
		return "Rectangle [field=" + getField() + ", a=" + a + ", b=" + b + "]";
	}
	
	public void rect(){
		System.out.println("RECTANGLE SPECIFIC METHOD INVOKED!");
	}
	
}
