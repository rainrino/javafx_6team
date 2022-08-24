package dayeun.service;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.stage.Stage;

public interface CommonService {
	public Parent showWindow(Stage s, String formPath);
	public void windowClose(ActionEvent event);
	public boolean chkLogin();
	public void errorBox(String title, String header, String content);
}
