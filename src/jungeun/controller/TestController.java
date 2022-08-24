package jungeun.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.stage.Stage;
import jungeun.mainAndClass.Server;
import jungeun.mainAndClass.TestResult;
import jungeun.service.CommonService;
import jungeun.service.CommonServiceImpl;
import jungeun.service.LoginService;
import jungeun.service.LoginServiceImpl;
import jungeun.service.TestService;
import jungeun.service.TestServiceImpl;

public class TestController extends Controller implements Initializable{
	private CommonService commonServ;
	private LoginService loginServ;
	private TestService testServ;
	public Server s;
	private Parent root;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		testServ = new TestServiceImpl();
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

	public void StartTest(ActionEvent event) {
		commonServ.WindowClose(event);
		Stage testQuiz = new Stage();
		root = commonServ.showWindow(testQuiz, "../fxml/Test1Quiz1Form.fxml");
	}
	
	public void NextTest(ActionEvent event) {
//		List<TestResult> quizAnswer = testServ.nextTest(root, event);
		String quizAnswer = testServ.nextTest(root, event);
		System.out.println(quizAnswer);
	}
	
	public void Login() {
		
	}
	
	public void ResultForm() {
		
	}
}
