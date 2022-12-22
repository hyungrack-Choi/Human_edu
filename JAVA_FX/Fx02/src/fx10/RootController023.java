package fx10;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class RootController023 implements Initializable {
	@FXML private TextArea textArea;

	@FXML private ComboBox<String> comboPublic;
	@Override
	public void initialize(URL location, 
			ResourceBundle resources) {
	}
	
	public void handleNew(ActionEvent e){
		textArea.appendText("New\n");
		try {		
			String strPublic = comboPublic.getValue();
			System.out.println("public: " + strPublic);
			textArea.appendText(strPublic.toString()+ "\n");
		} catch (Exception e2) {
			textArea.appendText("공개 or 비공개를 선택하세요\n");
		}finally {
			textArea.appendText("감사합니다.\n");
		}
		
	}
	
	public void handleOpen(ActionEvent e) {
		textArea.appendText("Open\n");
		try {
			String strPublic = comboPublic.getValue();
			System.out.println("public: " + strPublic);
			textArea.appendText(strPublic.toString()+ "\n");
		} catch (Exception e2) {
			textArea.appendText("공개 or 비공개를 선택하세요\n");
		}finally {
			textArea.appendText("감사합니다.\n");
		}
	}
	
	public void handleSave(ActionEvent e) {
		textArea.appendText("Save\n");
		try {
			String strPublic = comboPublic.getValue();
			System.out.println("public: " + strPublic);
			textArea.appendText(strPublic.toString()+ "\n");
		} catch (Exception e2) {
			textArea.appendText("공개 or 비공개를 선택하세요\n");
		}finally {
			textArea.appendText("감사합니다.\n");
		} 
		
	}
	
	public void handleExit(ActionEvent e) {
		Platform.exit();
	}
}
