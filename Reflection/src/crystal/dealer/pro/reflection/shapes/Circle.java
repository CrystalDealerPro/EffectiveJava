package crystal.dealer.pro.reflection.shapes;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import crystal.dealer.pro.reflection.Shape2D;

public class Circle implements Shape2D{

	private Point p;
	
	private double r;
	
	private Circle(){
		
	}
	
	private Circle(Point p, double r){
		this.p = p;
		this.r = r;
	}
	
	public static Circle createCircle(Point p, double r){
		return new Circle(p, r);
	}
	
	@Override
	public double getField() {
		return Math.PI * r * r;
	}

	@Override
	public void draw() {
		System.out.println("DRAWING CIRCLE");
		System.out.println(this.toString());
	}

	@Override
	public int getVerticiesNumber() {
		return 1;
	}

	@Override
	public List<Point> getVertices() {
		List<Point> list = new ArrayList<Point>();
		list.add(p);
		return list;
	}

	@Override
	public String toString() {
		return "Circle [field=" + getField() + ", r=" + r + "]";
	}

	public void circ(){
		System.out.println("CIRCLE SPECIFIC METHOD INVOKED!");
	}
	
}
