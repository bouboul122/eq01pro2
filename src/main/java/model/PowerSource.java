package model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Shape;

public class PowerSource extends ShapeEMR{
	
	public PowerSource(double xCoordinate, double yCoordinate, String mainColor, String borderColor) {
		super(xCoordinate, yCoordinate, mainColor, borderColor);
	}

	@Override
	public Shape createShape() {
		
		Ellipse ellipse = new Ellipse();
		ellipse.setCenterX(this.xCoordinate);
		ellipse.setCenterY(this.yCoordinate);
		ellipse.setRadiusX(30);
		ellipse.setRadiusY(15);
		ellipse.setFill(Color.web(this.mainColor));
		ellipse.setStroke(Color.web(this.borderColor));
		
		return ellipse;
	}

}
