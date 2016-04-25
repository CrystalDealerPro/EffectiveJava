package crystal.dealer.pro.reflection;

import java.awt.Point;
import java.util.List;

public interface Shape2D {

	double getField();
	
	void draw();
	
	int getVerticiesNumber();
	
	List<Point> getVertices();
	
}
