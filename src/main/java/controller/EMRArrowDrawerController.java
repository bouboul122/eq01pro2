package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;

public class EMRArrowDrawerController {
	
	@FXML
	TitledPane powerShapes = new TitledPane();
	@FXML
	TitledPane arrowShapes = new TitledPane();
	@FXML
	Button stateButton = new Button();
	@FXML
	Label stateLabel = new Label();
	@FXML
	Accordion shapeMenu = new Accordion();
	
	public void initialize()
	{
		System.out.println("Initialising");
		shapeMenu.setExpandedPane(powerShapes);
		System.out.println(powerShapes.isExpanded());
	}
	
	@FXML
	public void changeState()
	{
		System.out.println("Changing state!");
		System.out.println(powerShapes.isExpanded());
		if (powerShapes.isExpanded()) {
			shapeMenu.setExpandedPane(arrowShapes);
			stateLabel.setText("State: Arrows");
		}
		else if (arrowShapes.isExpanded()) {
			shapeMenu.setExpandedPane(powerShapes);
			stateLabel.setText("State: Power Shapes");
		}
	}
	
	
	

}
