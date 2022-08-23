package dayeun.service;

import java.io.IOException;

import dayeun.controller.Controller;
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

}
