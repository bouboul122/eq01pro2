package model;

import javafx.scene.shape.Shape;

public abstract class Arrow {
	
	double xBegin;
	double yBegin;
	double xEnd;
	double yEnd;
	
	Arrow(double xBegin, double yBegin, double xEnd, double yEnd){
		this.xBegin = xBegin;
		this.yBegin = yBegin;
		this.xEnd = xEnd;
		this.yEnd = yEnd;
	}
	
	public abstract Shape drawArrow(double xBegin, double yBegin, double xEnd, double yEnd);
	
}
