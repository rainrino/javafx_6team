package jungeun.service;

import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;
import jungeun.mainAndClass.Member;
import jungeun.mainAndClass.TestResult;

public class TestServiceImpl implements TestService{
	private CommonService commonServ;
	private int quizNum;
	private Member m;
	private String quizAnswer;
	List<TestResult> tsList = new ArrayList<TestResult>();

	@FXML RadioButton yesBtn;

	@Override
//	public List<TestResult> nextTest(Parent root, ActionEvent event) {
	public String nextTest(Parent root, ActionEvent event) {
		// TODO Auto-generated method stub
		commonServ = new CommonServiceImpl();
		quizNum = 1;
//		TestResult ts = new TestResult();
		String aaa = "";
		RadioButton yesBtn = (RadioButton) root.lookup("#yesBtn");
		if(yesBtn.isSelected()) {
//			ts.setRes("yes");
			aaa = quizNum + " : yes";
		} else {
//			ts.setRes("no");
			aaa = quizNum + " : no";
		}
//		tsList.add(ts);
		commonServ.WindowClose(event);
		quizNum++;
		Stage testQuiz = new Stage();
//		Stage testQuiz = (Stage) root.getScene().getWindow();
		commonServ.showWindow(testQuiz, "../fxml/Test1Quiz2Form.fxml");
//		return tsList;
		return aaa;
	}

	@Override
	public void resultTest(Parent root) {
		// TODO Auto-generated method stub

	}
}
