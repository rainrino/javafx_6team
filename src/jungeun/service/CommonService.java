package jungeun.service;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.stage.Stage;

public interface CommonService {
	public Parent showWindow(Stage s, String formPath);
	public void WindowClose(ActionEvent event);
	public void chkLogin();
	public void errorBox(String title, String header, String content);
}
