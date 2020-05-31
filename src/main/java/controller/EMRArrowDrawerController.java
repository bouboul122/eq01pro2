package controller;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Shape;
import model.AccumulationPower;
import model.ArrowState;
import model.PowerSource;
import model.ShapeEMRFactory;
import model.State;

public class EMRArrowDrawerController {
	
	State state;
	Dragboard db;
	ClipboardContent content;
	
	PowerSource powerSource = new PowerSource(0,0,"#98FB98", "#008000");
	Shape powerSourceShape = powerSource.createShape();
	AccumulationPower accumulationPower = new AccumulationPower(0,0,"#FFD700", "#FF0000");
	Shape accPowerShape = accumulationPower.createShape();
	
	@FXML
	TitledPane powerShapes;
	@FXML
	TitledPane arrowShapes;
	@FXML
	Button stateButton;
	@FXML
	Label stateLabel;
	@FXML
	Accordion shapeMenu;
	@FXML
	VBox powerVBox;
	@FXML 
	VBox arrowVBox;
	@FXML
	Pane drawingBoard;
	
	
	public void initialize()
	{
		System.out.println("Initialising");
		shapeMenu.setExpandedPane(powerShapes);
		System.out.println(powerShapes.isExpanded());
		
		//Adding dans les VBox
		powerVBox.setSpacing(10);
	    powerVBox.setAlignment(Pos.TOP_CENTER);
	    
		powerVBox.getChildren().add(powerSourceShape);
		powerVBox.getChildren().add(accPowerShape);
		
		powerSourceShape.setOnDragDetected(new EventHandler<MouseEvent>() {
		    public void handle(MouseEvent event) {
		        /* drag was detected, start a drag-and-drop gesture*/
		        /* allow any transfer mode */
		        db = powerSourceShape.startDragAndDrop(TransferMode.ANY);
		        
		        /* Put a string on a dragboard */
		        content = new ClipboardContent();
		        content.putString("PowerSource");
		        db.setContent(content);	
		        
		        event.consume();
		    }
		});
		
		accPowerShape.setOnDragDetected(new EventHandler<MouseEvent>() {
		    public void handle(MouseEvent event) {
		        /* drag was detected, start a drag-and-drop gesture*/
		        /* allow any transfer mode */
		        db = accPowerShape.startDragAndDrop(TransferMode.ANY);
		        
		        /* Put a string on a dragboard */
		        content = new ClipboardContent();
		        content.putString("AccumulationPower");
		        db.setContent(content);	
		        
		        event.consume();
		    }
		});
		
		drawingBoard.setOnDragOver(new EventHandler<DragEvent>() {
		    public void handle(DragEvent event) {
		        /* data is dragged over the target */
		        /* accept it only if it is not dragged from the same node 
		         * and if it has a string data */
		        if (event.getGestureSource() != drawingBoard &&
		                event.getDragboard().hasString()) {
		        	System.out.println("Dragging");
		            /* allow for both copying and moving, whatever user chooses */
		            event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
		        }
		        
		        event.consume();
		    }
		});
		
		//Manque la fonction drop//
	}
	
	@FXML
	public void changeState()
	{
		System.out.println("Changing state!");
		System.out.println(powerShapes.isExpanded());
		if (powerShapes.isExpanded()) {
			shapeMenu.setExpandedPane(arrowShapes);
			stateLabel.setText("State: Arrows");
			state = new ArrowState();
			System.out.println(state);
		}
		else if (arrowShapes.isExpanded()) {
			shapeMenu.setExpandedPane(powerShapes);
			stateLabel.setText("State: Power Shapes");
		}
	}
	
	
	

}
