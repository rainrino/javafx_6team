package dayeun.controller;

import java.net.URL;
import java.util.ResourceBundle;

import dayeun.service.CommonService;
import dayeun.service.CommonServiceImpl;
import dayeun.service.MyPageService;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MyPageController extends Controller implements Initializable {
	private Parent root;
	private CommonService cs;
	//private MyPageService mps;
	
	/////////////////////////////////Controller 메소드/////////////////////////////////////////
	@Override
	public void setRoot(Parent root) {
		// TODO Auto-generated method stub
		this.root=root;
	}//setRoot
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		cs=new CommonServiceImpl();

	
	}//initialize

	@Override
	public void OpenHome(ActionEvent event) {
		// TODO Auto-generated method stub
		Stage s=new Stage();
		cs.showWindow(s, "../fxml/MainForm.fxml");
		cs.windowClose(event);
	}//OpenHome

	@Override
	public void OpenMyPage(ActionEvent event) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//현재 로그인인지 아닌지 구분
		//로그인 상태 : 마이페이지로 이동
		//비로그인 상태 : 로그인 페이지로 이동
		Server server=new Server();
		server.loginFlag=true;
		server.id="123";
		
		if(server.loginFlag) { //로그인 flag가 true면 마이페이지로 이동, 아니면 로그인 페이지로 이동
			CommonService cs=new CommonServiceImpl();
			Stage s=new Stage();
			cs.showWindow(s, "../fxml/MyPageForm.fxml");
			
			cs.windowClose(event);
		}else {
			CommonService cs=new CommonServiceImpl();
			Stage s=new Stage();
			cs.showWindow(s, "../fxml/LoginForm.fxml");
			
			cs.windowClose(event);
		}//end else
		
	}//OpenMyPage
	
	//////////////////////////////////마이페이지 메소드/////////////////////////////////////
	


}//class
