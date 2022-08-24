package dayeun.controller;

import java.net.URL;
import java.util.ResourceBundle;

import dayeun.service.CommonService;
import dayeun.service.CommonServiceImpl;
import dayeun.service.LoginService;
import dayeun.service.LoginServiceImpl;
import dayeun.service.MemberDropService;
import dayeun.service.MemberDropServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class MemberDropSuccessController extends Controller implements Initializable {
	private Parent root;
	private CommonService cs;
	private MemberDropService mds;
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
	
	public void memberDrop(ActionEvent event) { //MemberDropSurveyForm에서 탈퇴하기 버튼을 클릭할 시,
		@SuppressWarnings("unchecked")
		ComboBox<String> surveyCb = (ComboBox<String>) root.lookup("#surveyCb");
		Stage s=new Stage();
		int res=0;
		if(surveyCb.getValue() != null) { //comboBox가 선택되었을 때,
			
			res=mds.dropMember(); //회원탈퇴 메소드 실행
			if(res==1) { //res ==1은 회원탈퇴가 성공적으로 실행된 것
				cs.showWindow(s, "../fxml/MemberDropSuccessForm.fxml");
				cs.windowClose(event); // 회원탈퇴 설문 페이지 닫기
			}else { //회원탈퇴가 이루어지지 않았을 떄 - db 에러
				cs.errorBox("경고", "회원탈퇴 실패", "오류가 발생했습니다. 관리자에게 문의해주세요.");
			}//end else
			
		}else {
			cs.errorBox("경고", "회원탈퇴 실패", "탈퇴 이유가 선택되지 않았습니다"); //comboBox가 선택되지 않았을 때,
		}//end else
		
	}//memberDrop
	
	public void successDrop() {
		Stage s=new Stage();
		cs.showWindow(s, "../fxml/MainForm.fxml");
	}//successDrop
	
}//class
