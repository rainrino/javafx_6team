package jungeun.controller;

import java.net.URL;
import java.util.ResourceBundle;

import jungeun.service.CommonService;
import jungeun.service.CommonServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class MainController extends Controller implements Initializable {
	private Parent root;
	
	public void setRoot(Parent root) {
		// TODO Auto-generated constructor stub
		this.root = root;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	}

	@Override
	public void OpenHome() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void OpenMyPage() {
		// TODO Auto-generated method stub
		
	}
	
	public void OpenTest1Page(ActionEvent event) {
		CommonService commonServ = new CommonServiceImpl();
		TestResult.testNum = 1;
		Stage Test1 = new Stage();
		commonServ.showWindow(Test1, "../fxml/Test1Form.fxml");
		commonServ.windowClose(event);
	}
	
	public void OpenTest2Page(ActionEvent event) {
		CommonService commonServ = new CommonServiceImpl();
		Stage Test2 = new Stage();
		commonServ.showWindow(Test2, "../fxml/Test2Form.fxml");
		commonServ.windowClose(event);
		TestResult.testNum = 2;
	}
	
	public void OpenTest3Page(ActionEvent event) {
		CommonService commonServ = new CommonServiceImpl();
		Stage Test3 = new Stage();
		commonServ.showWindow(Test3, "../fxml/Test3Form.fxml");
		commonServ.windowClose(event);
		TestResult.testNum = 3;
	}
}
