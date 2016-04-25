package crystal.dealer.pro.reflection;

import java.awt.Point;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

import crystal.dealer.pro.reflection.shapes.Circle;
import crystal.dealer.pro.reflection.shapes.Rectangle;
import crystal.dealer.pro.reflection.shapes.Triangle;


public class Main {

	public static void main(String[] args){
		
		List<Object> listOfShapes = new ArrayList<Object>();
		
		listOfShapes.add(Circle.createCircle(new Point(10, 5), 2.5d));
		listOfShapes.add(Rectangle.createRectangle(new Point(10, 10), new Point(0, 0)));
		listOfShapes.add(Triangle.createTriangle(new Point(5, 5), new Point(8, 8), new Point(2, 5)));
		
		
		
		for(Object o : listOfShapes){
			List<Method> methods = Arrays.asList(o.getClass().getMethods());
			
			System.out.println(o.getClass().toString());
			
			for(Method m : methods){
				String methodName = m.getName();

				System.out.println(methodName);
			}
			
			
			List<Method> drawMethods = (List<Method>) CollectionUtils.select(methods, (Method m) -> {
				return m.getParameterCount() > 0;
			});

			System.out.println("DRAW METHODS:");
			for(Method m : drawMethods){
				System.out.println(m.getName());
			}
		}
	}
}
