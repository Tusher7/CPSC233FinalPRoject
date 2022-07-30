package application;

import javafx.scene.control.Label;

public class LabelControl {
	
	private Label label;
	private String text;
	
	public LabelControl(Label label, String text) {
		this.label = label;
	}
	
	String labelChange() {
		
		label.setText(text);
		
		return null;		
	}

}
