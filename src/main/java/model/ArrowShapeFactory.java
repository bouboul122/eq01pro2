package model;

import javafx.scene.shape.Shape;

public class ArrowShapeFactory {
	Shape shape;
	Arrow arrowToDraw;
	
	
	public enum arrows {
		redArrow, 
		blackArrow};
	
	public Shape getArrow(arrows arrow, double xBegin, double yBegin, double xEnd, double yEnd) {
		switch(arrow) {
		case redArrow:
			arrowToDraw = new ArrowSimpleRed(xBegin,yBegin,xEnd,yEnd);
			shape = arrowToDraw.drawArrow();
			break;
		case blackArrow:
			shape = null;
			break;
		default:
			shape = null;		
		}	
		return shape;
	}

}
