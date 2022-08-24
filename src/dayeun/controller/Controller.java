package dayeun.controller;

import javafx.event.ActionEvent;
import javafx.scene.Parent;

public abstract class Controller {
	public abstract void setRoot(Parent root);
	public abstract void OpenHome(ActionEvent event); //홈 페이지로 이동
	public abstract void OpenMyPage(ActionEvent event); //마이 페이지로 이동
}
