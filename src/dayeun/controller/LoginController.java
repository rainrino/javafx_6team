package dayeun.controller;

import java.net.URL;
import java.util.ResourceBundle;

import dayeun.service.CommonService;
import dayeun.service.CommonServiceImpl;
import dayeun.service.LoginService;
import dayeun.service.LoginServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController extends Controller implements Initializable {

	private Parent root;
	private CommonService cs;
	private LoginService ls;
	private MainController mc;
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
		ls=new LoginServiceImpl();
		mc=new MainController();
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
	
	//////////////////////////////////////////////로그인 컨트롤러 메소드///////////////////////////////////////////////
	public void Login(ActionEvent event) {
		//로그인 시도 후 회원 정보 일치하면 원하는 페이지로 이동한다 (Server의 navigation변수를 사용)
		TextField idTf=(TextField) root.lookup("#idTf"); //사용자가 입력한 아이디 가져오기
		PasswordField passPf=(PasswordField) root.lookup("#passPf"); //사용자가 입력한 비밀번호 가져오기
		
		boolean loginFlag=ls.selectLogin(idTf.getText(), passPf.getText()); 
		//로그인 시도 후 회원 정보 불일치하면 에러 메세지를 띄운다
		Stage s=new Stage();
		if(loginFlag) {
			//사용자 정보가 일치하는 경우
			switch(Server.navigation) {
			case "mypage" : cs.showWindow(s, "../fxml/MainForm.fxml") ; break; //메인페이지 버튼 클릭 후 로그인 창 이동 했을 경우 마이페이지로 보내기
			case "membership" : cs.showWindow(s, "../fxml/MainForm.fxml") ; break;
			default: cs.showWindow(s, "../fxml/MainForm.fxml");
			}//end switch
			
			cs.windowClose(event); //로그인 창을 닫는다
		}else {
			//불일치할 경우
			cs.errorBox("로그인 실패", "로그인 실패", "없는 아이디 또는 아이디 및 비밀번호가 다릅니다.");
		}//end else
	}//Login
	
	public void OpenMemberShipForm(ActionEvent event) { //회원가입 페이지로 이동
		Stage s=new Stage();
		Parent root=null;
		root=cs.showWindow(s, "../fxml/MemberShipForm.fxml"); // 회원가입 페이지로 이동
		cs.windowClose(event); // 로그인 페이지를 닫는다

		//myText.setEditable(false); --비활성화 방법 (사용자가 입력하지 못하게 함)
		TextField idTf =(TextField) root.lookup("#idTf");
		idTf.setEditable(false); 
		
		
	}//OpenMemberShipForm
	

}
