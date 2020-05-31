package model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

import javafx.scene.shape.Shape;

public class ArrowSimpleRed extends Arrow{
	
	double ArrowHeadSize = 5.0;
	
	ArrowSimpleRed(double xBegin, double yBegin, double xEnd, double yEnd) {
		super(xBegin, yBegin, xEnd, yEnd);
	}

	@Override
	public Shape drawArrow() {
		
	        //Line
	        
	        
	        //ArrowHead
	        /*double angle = Math.atan2((this.yEnd - this.yBegin), (this.xEnd - this.xBegin)) - Math.PI / 2.0;
	        double sin = Math.sin(angle);
	        double cos = Math.cos(angle);
	        //point1
	        double x1 = (- 1.0 / 2.0 * cos + Math.sqrt(3) / 2 * sin) * this.ArrowHeadSize + this.xEnd;
	        double y1 = (- 1.0 / 2.0 * sin - Math.sqrt(3) / 2 * cos) * this.ArrowHeadSize + this.yEnd;
	        //point2
	        double x2 = (1.0 / 2.0 * cos + Math.sqrt(3) / 2 * sin) * this.ArrowHeadSize + this.xEnd;
	        double y2 = (1.0 / 2.0 * sin - Math.sqrt(3) / 2 * cos) * this.ArrowHeadSize + this.yEnd;
	        
	        Shape shape;
	        
	        Line line = new Line();
	        line.setStartX(x1);
	        line.setStartY(y1);
	        line.setEndX(x2);
	        line.setEndY(y2);
	        
	        shape = line;
	        
		*/
			Line line = new Line();
			line.setStartX(xBegin);
			line.setStartY(yBegin);
			line.setEndX(xEnd);
			line.setEndY(yEnd);
			
			line.setFill(Color.web("#ff0000"));
			line.setStrokeWidth(5);
			
	        return line;
		
		
	}

}
