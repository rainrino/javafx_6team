package jungeun.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import jungeun.mainAndClass.Server;
import jungeun.service.CommonService;
import jungeun.service.CommonServiceImpl;
import jungeun.service.LoginServiceImpl;
import jungeun.service.TestService;
import jungeun.service.TestServiceImpl;

public class TestController extends Controller implements Initializable{
	private CommonService commonServ;
	private LoginServiceImpl lsi;
	private TestService ts;
	public Server s;
	private Parent root;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		ts = new TestServiceImpl();
		commonServ = new CommonServiceImpl();
	}
	
	@Override
	public void setRoot(Parent root) {
		// TODO Auto-generated method stub
		this.root = root;
		
	}

	@Override
	public void OpenHome() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void OpenMyPage() {
		// TODO Auto-generated method stub
		
	}

	public void StartTest() {
		
	}
	
	public void NextTest() {
		
	}
	
	public void Login() {
		
	}
	
	public void ResultForm() {
		
	}
}
