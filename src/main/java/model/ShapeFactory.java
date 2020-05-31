package model;

import javafx.scene.shape.Shape;

public class ShapeFactory {
	
	public enum eshape {
		sourcePower,
		accumulationPower,
		
	};
	
	public Shape getShape(eshape element, double xCoord, double yCoord, String mainColor, String borderColor)
	{
		Shape shape;
		switch(element) {
		case sourcePower:
			shape = (new PowerSource(xCoord, yCoord, mainColor, borderColor)).createShape();	
			break;
		case accumulationPower:
			shape = (new AccumulationPower(xCoord, yCoord, mainColor, borderColor)).createShape();
			break;
		
		default:
			shape = null;
		}
		
		return shape;
	}

}
