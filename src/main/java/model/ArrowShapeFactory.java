package model;

import javafx.scene.shape.Shape;

public class ArrowShapeFactory {
	ShapeEMR shape;
	
	public enum arrows {
		redArrow, 
		blackArrow};
	
	public ShapeEMR getArrow(arrows arrow, double xBegin, double yBegin, double xEnd, double yEnd) {
		switch(arrow) {
		case redArrow:
			shape = null;
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
