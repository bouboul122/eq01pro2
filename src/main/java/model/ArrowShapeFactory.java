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
			shape = new RedArrow(xBegin, yBegin, xEnd, yEnd, "#FF0000", "#FF0000");
			break;
		case blackArrow:
			shape = new BlackArrowDouble(xBegin, yBegin, xEnd, yEnd, "#000000", "#000000");
			break;
		default:
			shape = null;		
		}	
		return shape;
	}

}
