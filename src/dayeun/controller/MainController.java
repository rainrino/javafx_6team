package dayeun.controller;

import java.net.URL;
import java.util.ResourceBundle;

import dayeun.service.CommonService;
import dayeun.service.CommonServiceImpl;
import dayeun.service.MyPageService;
import dayeun.service.MyPageServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainController extends Controller implements Initializable {
	private Parent root;
	private CommonService cs;
	private MyPageService mps;

	public void setRoot(Parent root) {
		// TODO Auto-generated constructor stub
		this.root = root;
	}//setRoot
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		cs=new CommonServiceImpl();
		mps=new MyPageServiceImpl();
	}//initialize

	@Override
	public void OpenHome(ActionEvent event) { //홈 페이지로 이동
		// TODO Auto-generated method stub
		Stage s=new Stage();
		cs.showWindow(s, "../fxml/MainForm.fxml");
		cs.windowClose(event);
	}//OpenHome

	@Override
	public void OpenMyPage(ActionEvent event) { //마이 페이지로 이동
		// TODO Auto-generated method stub
		//현재 로그인인지 아닌지 구분
		//로그인 상태 : 마이페이지로 이동
		//비로그인 상태 : 로그인 페이지로 이동

		Server.loginFlag=true;
		Server.id="456";
		Member m=new Member();
		
		if(Server.loginFlag) { //로그인 flag가 true면 마이페이지로 이동, 아니면 로그인 페이지로 이동
			CommonService cs=new CommonServiceImpl();
			Stage s=new Stage();
			Parent form=cs.showWindow(s, "../fxml/MyPageForm.fxml");
			cs.windowClose(event);
			//////////////////////////아이디에 따른 정보 가져와서 마이페이지에 뿌려주기///////////////////////////////////////
			//ComboBox<String> cmbAge = (ComboBox<String>) form.lookup("#cmbAge");
			
			m=mps.selectMyPage(Server.id); //회원의 정보를 가져온다
			
			Label idLbl=(Label) form.lookup("#idLbl");
			Label emailLbl=(Label) form.lookup("#emailLbl");
			Label test1ResLbl=(Label) form.lookup("#test1ResLbl");
			Label test2ResLbl=(Label) form.lookup("#test2ResLbl");
			Label test3ResLbl=(Label) form.lookup("#test3ResLbl");
			//테스트 결과 담을 String
			String test1Res="";
			String test2Res="";
			String test3Res="";
			
			//테스트 결과 번호에 따른 테스트 결과 이름을 부여한다
			switch(m.getTest1Res()){
				case 1 : test1Res="타고난 다이어트 천재"; break;
				case 2 : test1Res="희망이 보이는 다이어터"; break;
				case 3 : test1Res="새싹 다이어터"; break;
				default : test1Res="테스트하러가기";
			}//end switch
			
			switch(m.getTest2Res()){
				case 1 : test2Res="아찔한 파산형"; break;
				case 2 : test2Res="위험한 지름신형"; break;
				case 3 : test2Res="동전 가득 저금통형"; break;
				default : test2Res="테스트하러가기";
			}//end switch
			
			switch(m.getTest3Res()){
				case 1 : test3Res="위풍당당 DNA"; break;
				case 2 : test3Res="리액션왕 DNA"; break;
				case 3 : test3Res="복세편살 DNA"; break;
				default : test3Res="테스트하러가기";
			}//end switch
			
			//회원 정보 마이페이지에 뿌리기
			idLbl.setText(m.getId());
			emailLbl.setText(m.getEmail());
			test1ResLbl.setText(test1Res);
			test2ResLbl.setText(test2Res);
			test3ResLbl.setText(test3Res);

			
		}else {
			CommonService cs=new CommonServiceImpl();
			Stage s=new Stage();
			cs.showWindow(s, "../fxml/LoginForm.fxml");
			cs.windowClose(event);
		}//end else
	}//OpenMyPage
	
	
	public void OpenTest1Page() { //다이어트 의지 테스트로 이동
		
	}//OpenTest1Page
	
	public void OpenTest2Page() { //소비 성향 테스트로 이동
		
	}//OpenTest1Page
	
	public void OpenTest3Page() { //모임 성향 테스트로 이동
		
	}//OpenTest1Page
	
}//class
