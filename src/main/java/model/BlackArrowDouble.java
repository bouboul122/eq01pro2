package model;

 

import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;

 

public class BlackArrowDouble extends Arrow{

 

    public BlackArrowDouble(double xCoordinate, double yCoordinate, double xEnd, double yEnd, String mainColor,
            String borderColor) {
        super(xCoordinate, yCoordinate, xEnd, yEnd, mainColor, borderColor);
        
    }

 

    @Override
    public Shape createShape() {
       return null;
        
    }
}