package model;

 

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Shape;

 

public class DoubleBlackArrow extends Arrow{

 

    public DoubleBlackArrow(double xBegin, double yBegin, double xEnd, double yEnd) {
        super(xBegin, yBegin, xEnd, yEnd);
            System.out.println("Allo");
    }
    
    final double ARROWHEAD_ANGLE = Math.toRadians(20);
    final double ARROWHEAD_LENGTH = 10;    
    @Override
    public Shape drawArrow() {
        
        Line line = new Line();
        Polyline headA = new Polyline();
        Polyline headB = new Polyline();
        
        line.setFill(Color.BLACK);
        
        line.setStartX(xBegin);
        line.setStartY(yBegin);
        line.setEndX(xEnd);
        line.setEndY(yEnd);
        
        double theta = Math.atan2(yEnd-yBegin, xEnd-xBegin);
        
        //ArrowHead 1
        double x = xBegin + Math.acos(theta + ARROWHEAD_ANGLE) * ARROWHEAD_ANGLE;
        double y = yBegin + Math.sin(theta + ARROWHEAD_ANGLE) * ARROWHEAD_ANGLE;
        headA.getPoints().setAll(x,y,xBegin,yBegin);
        x = xBegin + Math.acos(theta - ARROWHEAD_ANGLE) * ARROWHEAD_ANGLE;
        y = yBegin + Math.sin(theta - ARROWHEAD_ANGLE) * ARROWHEAD_ANGLE;
        headA.getPoints().setAll(x,y);
        
        //Arrowhead2
        x = xEnd - Math.acos(theta + ARROWHEAD_ANGLE) * ARROWHEAD_ANGLE;
        y = yEnd - Math.sin(theta + ARROWHEAD_ANGLE) * ARROWHEAD_ANGLE;
        headB.getPoints().setAll(x,y,xEnd,yEnd);
        x = xEnd - Math.acos(theta - ARROWHEAD_ANGLE) * ARROWHEAD_ANGLE;
        y = yEnd - Math.sin(theta - ARROWHEAD_ANGLE) * ARROWHEAD_ANGLE;
        headB.getPoints().setAll(x,y);
        
        Shape arrowHeadA = Shape.union(line, headA);
        //Shape arrowHeadAB = Shape.union(arrowHeadA, headB);
        Circle circle = new Circle();
        circle.setCenterX(xBegin);
        circle.setCenterY(yBegin);
        circle.setRadius(20);
        
        arrowHeadA.setStroke(Color.web("#000000"));
        System.out.println("Allo");
        return circle;
        
        
    }
    
}
    