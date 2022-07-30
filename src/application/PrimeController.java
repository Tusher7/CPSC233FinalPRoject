package application;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class PrimeController {
	
	 @FXML
    private ChoiceBox<String> skillChooseChoiceBox;
	 
	 @FXML
	  private Label skillPicked;
	  
	 
	 
	 
	 
	 
	 
	 void changeLabel(Label label, String text) {
	
		 label.setText(text);
}
}
