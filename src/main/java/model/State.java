package model;

import javafx.scene.shape.Shape;

public interface State {
	
	public void setElement(String element);
	
	public Shape drawShape();

}
