package model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;

public class ArrowDoubleBlack extends Arrow{

	ArrowDoubleBlack(double xBegin, double yBegin, double xEnd, double yEnd) {
		super(xBegin, yBegin, xEnd, yEnd);
	
	}
	

	@Override
	public Shape drawArrow() {
		
		Line line = new Line();
		
		
		line.setStartX(xBegin);
		line.setStartY(yBegin);
		line.setEndX(xEnd);
		line.setEndY(yEnd);
		
		
		line.setFill(Color.web("#ff0000"));
		line.setStrokeWidth(5);
		
		return null;
	}
	
	
	

}
