package dayeun.service;

import java.io.IOException;

import dayeun.controller.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CommonServiceImpl implements CommonService {

	@Override
	public Parent showWindow(Stage s, String formPath) {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader
				(getClass().getResource(formPath));
		
		Parent root = null;
		//경로
		try {
			root = loader.load();
			s.setScene(new Scene(root));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Controller ctl = loader.getController();
		ctl.setRoot(root);
		
		s.show();
		
		return root;
	}

	@Override
	public void windowClose(ActionEvent event) {
		// TODO Auto-generated method stub
		Parent root = (Parent) event.getSource();
		Stage stage = (Stage) root.getScene().getWindow();
		stage.close();
	}//windowClose

	@Override
	public boolean chkLogin() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void errorBox(String title, String header, String content) {
		// TODO Auto-generated method stub
		
	}

}
