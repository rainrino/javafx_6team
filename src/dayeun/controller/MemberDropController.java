package dayeun.controller;

import java.net.URL;
import java.util.ResourceBundle;

import dayeun.service.CommonService;
import dayeun.service.CommonServiceImpl;
import dayeun.service.MemberDropService;
import dayeun.service.MemberDropServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class MemberDropController extends Controller implements Initializable {
	private Parent root;
	
	private CommonService cs;
	//private MyPageService mps;
	private MemberDropService mds;
	
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
		mds=new MemberDropServiceImpl();
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
	
	/////////////////////////////////////////////MemberDropController(회원탈퇴) 메소드//////////////////////////////////////////////////
	public void next(ActionEvent event) {  //MemeberDropWarnForm에서 다음 버튼을 클릭할 시,
		//탈퇴 설문조사 comboBOX 생성
		Parent form=null;
		Stage s=new Stage();
		form=cs.showWindow(s, "../fxml/MemberDropSurveyForm.fxml"); //회원탈퇴 이유 설문조사 페이지로 이동
		String[] items = {"자주 사용하지 않습니다.", "사용할 때 오류가 있습니다.", "개인정보 노출이 우려됩니다.", "기타"};
		
		@SuppressWarnings("unchecked")
		ComboBox<String> surveyCb = (ComboBox<String>) form.lookup("#surveyCb");
		
		for(String item : items) {
			surveyCb.getItems().add(item);
		}//end for
		cs.windowClose(event); // 회원탈퇴 경고 페이지 닫기
	}//nextBtn
	

	
	
	
}//class
