package model;

public class ShapeFactory {
	
	public enum eshape {
		sourcePower,
		accumulationPower,
	};
	
	public ShapeEMR getShape(eshape element, double xCoord, double yCoord, String mainColor, String borderColor)
	{
		ShapeEMR shape;
		switch(element) {
		case sourcePower:
			shape = new PowerSource(xCoord, yCoord, mainColor, borderColor);
			break;
		case accumulationPower:
			shape = new AccumulationPower(xCoord, yCoord, mainColor, borderColor);
			break;
		default:
			shape = null;
		}
		return shape;
	}

}
