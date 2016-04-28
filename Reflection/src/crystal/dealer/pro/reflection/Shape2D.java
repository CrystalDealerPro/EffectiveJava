package crystal.dealer.pro.reflection;

import java.awt.Point;
import java.util.List;

public interface Shape2D {

	double getField();
	
	void draw();
	
	int getVerticiesNumber();
	
	List<Point> getVertices();
	
	@SuppressWarnings("unchecked")
	default <T extends Shape2D> T returnBigger(T shape){	
		return this.getField() > shape.getField() ? (T)this : shape;
	}
	
	default Shape2D returnSmaller(Shape2D shape){
		return this.getField() > shape.getField() ? this : shape;
	}
}
