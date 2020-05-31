package model;

import javafx.scene.shape.Shape;

public class ShapeState implements State{
	
	String element;
	double xCoord;
	double yCoord;
	
	
	ShapeFactory shapeFactory = new ShapeFactory();

	@Override
	public Shape drawShape() {
		if (element.contentEquals("PowerSource")) {
			return shapeFactory.getShape(ShapeFactory.eshape.sourcePower, xCoord, yCoord, "#98FB98",  "#008000");
		} else if (element.contentEquals("AccumulationPower")) {
			return shapeFactory.getShape(ShapeFactory.eshape.accumulationPower, xCoord, yCoord, "#FFD700",  "#FF0000");
		} else {
			return null;
		}
	}
	
	public void setElement(String element)
	{
		this.element = element;
	}

}
