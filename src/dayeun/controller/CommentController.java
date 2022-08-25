package dayeun.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import dayeun.service.CommentService;
import dayeun.service.CommentServiceImpl;
import dayeun.service.CommonService;
import dayeun.service.CommonServiceImpl;
import dayeun.service.MyPageService;
import dayeun.service.MyPageServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CommentController extends Controller implements Initializable {
	private Parent root;
	private CommonService cs;
	private MyPageService mps;
	private CommentService cms;
	
	public void setRoot(Parent root) {
		// TODO Auto-generated constructor stub
		this.root = root;
	}//setRoot
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		cs=new CommonServiceImpl();
		mps=new MyPageServiceImpl();
		cms=new CommentServiceImpl();
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
			//비회원인 상태에서 마이페이지 버튼을 눌렀을 경우
			Server.navigation="mypage";
			CommonService cs=new CommonServiceImpl();
			Stage s=new Stage();
			cs.showWindow(s, "../fxml/LoginForm.fxml");
			cs.windowClose(event);
		}//end else
	}//OpenMyPage
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void InsertComment(ActionEvent event) {
		Stage s=new Stage();
		setRoot(root);
		Comment c=new Comment();
		
		int res=0; //댓글이 잘 입력되었는지 확인
		
		TextField inputTf=(TextField) root.lookup("#inputTf");
		c.setContent(inputTf.getText()); //댓글 comment에 저장
		if(Server.loginFlag) { //로그인 상태일 때		
			
			switch(TestResult.testNum) {
			case 1:
				switch(TestResult.result){
				case 1:
					c.setRes("#타고난 다이어트 천재");
					break;
				case 2:
					c.setRes("#희망이 보이는 다이어터");
					break;
				case 3:
					c.setRes("#새싹 다이어터");
					break;
				}//end switch
				c.setId(Server.id);
				res=cms.insertCommentTest1(c);
				//상태 메세지 출력
				if(res==1) { //댓글 입력 완료 시
					cs.errorBox("댓글 입력 완료", "댓글 입력 완료", "댓글이 입력되었습니다");
				}else {
					cs.errorBox("댓글 입력 실패", "댓글 입력 실패", "오류가 발생했습니다. 관리자에게 문의해주세요");
				}//end else
				
				//댓글 가져와서 뿌리기 (최근2건만)
				root=cs.showWindow(s, "../fxml/CommentTest.fxml");
				List<Comment> commentList=new ArrayList<>();
				commentList=cms.selectCommentList();
				
				Label idLbl1=(Label) root.lookup("#idLbl1");
				Label resLbl1=(Label) root.lookup("#resLbl1");
				Label contentLbl1=(Label) root.lookup("#contentLbl1");
				
				Label idLbl2=(Label) root.lookup("#idLbl2");
				Label resLbl2=(Label) root.lookup("#resLbl2");
				Label contentLbl2=(Label) root.lookup("#contentLbl2");
				
				idLbl1.setText(commentList.get(0).getId());
				resLbl1.setText(commentList.get(0).getRes());
				contentLbl1.setText(commentList.get(0).getContent());

//				idLbl2.setText(commentList.get(1).getId());
//				resLbl2.setText(commentList.get(1).getRes());
//				contentLbl2.setText(commentList.get(1).getContent());
				cs.windowClose(event);
				break;
			case 2:
				break;
			case 3: 
				break;
			}//end switch
		
		}else { //비회원 상태일 때
			cs.showWindow(s, "../fxml/LoginForm.fxml");
		}//end else
		
	}//InsertComment
	
	
	
	
}
