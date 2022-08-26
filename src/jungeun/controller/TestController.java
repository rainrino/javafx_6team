package jungeun.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import jungeun.service.CommonService;
import jungeun.service.CommonServiceImpl;
import jungeun.service.TestService;
import jungeun.service.TestServiceImpl;

public class TestController extends Controller implements Initializable{
	private CommonService commonServ;
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

	public void StartQuiz(ActionEvent event) {
		Stage s = new Stage();
		TestResult.yesSum = 0;
		switch(TestResult.testNum) {
		case 1:	
			commonServ = new CommonServiceImpl();
			commonServ.showWindow(s, "../fxml/Test1Quiz1Form.fxml");
			commonServ.windowClose(event);
			break;
		case 2: 
			commonServ = new CommonServiceImpl();
			commonServ.showWindow(s, "../fxml/Test2Quiz1Form.fxml");
			commonServ.windowClose(event);
			break;
		case 3: 
			commonServ = new CommonServiceImpl();
			commonServ.showWindow(s, "../fxml/Test3Quiz1Form.fxml");
			commonServ.windowClose(event);
			break;	
		}
	}

	public void Quiz2(ActionEvent event) {
		Stage s = new Stage();
		RadioButton yesBtn = null;
		switch(TestResult.testNum) {
		case 1:
			setRoot(root);
			yesBtn = (RadioButton) root.lookup("#yesBtn");
			if(yesBtn.isSelected()) {
				TestResult.yesSum++;
			}
			commonServ = new CommonServiceImpl();
			commonServ.showWindow(s, "../fxml/Test1Quiz2Form.fxml");
			commonServ.windowClose(event);
			break;

		case 2: 
			setRoot(root);
			yesBtn = (RadioButton) root.lookup("#yesBtn");
			if(yesBtn.isSelected()) {
				TestResult.yesSum++;
			}
			commonServ = new CommonServiceImpl();
			commonServ.showWindow(s, "../fxml/Test2Quiz2Form.fxml");
			commonServ.windowClose(event);
			break;

		case 3: 
			setRoot(root);
			yesBtn = (RadioButton) root.lookup("#yesBtn");
			if(yesBtn.isSelected()) {
				TestResult.yesSum++;
			}
			commonServ = new CommonServiceImpl();
			commonServ.showWindow(s, "../fxml/Test3Quiz2Form.fxml");
			commonServ.windowClose(event);
			break;	
		}
	}

	public void Quiz3(ActionEvent event) {
		Stage s = new Stage();
		RadioButton yesBtn = null;
		switch(TestResult.testNum) {
		case 1:
			setRoot(root);
			yesBtn = (RadioButton) root.lookup("#yesBtn");
			if(yesBtn.isSelected()) {
				TestResult.yesSum++;
			}
			commonServ = new CommonServiceImpl();
			commonServ.showWindow(s, "../fxml/Test1quiz3Form.fxml");
			commonServ.windowClose(event);
			break;

		case 2: 
			setRoot(root);
			yesBtn = (RadioButton) root.lookup("#yesBtn");
			if(yesBtn.isSelected()) {
				TestResult.yesSum++;
			}
			commonServ = new CommonServiceImpl();
			commonServ.showWindow(s, "../fxml/Test2quiz3Form.fxml");
			commonServ.windowClose(event);
			break;

		case 3: 
			setRoot(root);
			yesBtn = (RadioButton) root.lookup("#yesBtn");
			if(yesBtn.isSelected()) {
				TestResult.yesSum++;
			}
			commonServ = new CommonServiceImpl();
			commonServ.showWindow(s, "../fxml/Test3quiz3Form.fxml");
			commonServ.windowClose(event);
			break;	
		}
	}

	public void Quiz4(ActionEvent event) {
		Stage s = new Stage();
		RadioButton yesBtn = null;
		switch(TestResult.testNum) {
		case 1:
			setRoot(root);
			yesBtn = (RadioButton) root.lookup("#yesBtn");
			if(yesBtn.isSelected()) {
				TestResult.yesSum++;
			}
			commonServ = new CommonServiceImpl();
			commonServ.showWindow(s, "../fxml/Test1quiz4Form.fxml");
			commonServ.windowClose(event);
			break;

		case 2: 
			setRoot(root);
			yesBtn = (RadioButton) root.lookup("#yesBtn");
			if(yesBtn.isSelected()) {
				TestResult.yesSum++;
			}
			commonServ = new CommonServiceImpl();
			commonServ.showWindow(s, "../fxml/Test2quiz4Form.fxml");
			commonServ.windowClose(event);
			break;

		case 3: 
			setRoot(root);
			yesBtn = (RadioButton) root.lookup("#yesBtn");
			if(yesBtn.isSelected()) {
				TestResult.yesSum++;
			}
			commonServ = new CommonServiceImpl();
			commonServ.showWindow(s, "../fxml/Test3quiz4Form.fxml");
			commonServ.windowClose(event);
			break;	
		}
	}

	public void Quiz5(ActionEvent event) {
		Stage s = new Stage();
		RadioButton yesBtn = null;
		switch(TestResult.testNum) {
		case 1:
			setRoot(root);
			yesBtn = (RadioButton) root.lookup("#yesBtn");
			if(yesBtn.isSelected()) {
				TestResult.yesSum++;
			}
			commonServ = new CommonServiceImpl();
			commonServ.showWindow(s, "../fxml/Test1quiz5Form.fxml");
			commonServ.windowClose(event);
			break;

		case 2: 
			setRoot(root);
			yesBtn = (RadioButton) root.lookup("#yesBtn");
			if(yesBtn.isSelected()) {
				TestResult.yesSum++;
			}
			commonServ = new CommonServiceImpl();
			commonServ.showWindow(s, "../fxml/Test2quiz5Form.fxml");
			commonServ.windowClose(event);
			break;

		case 3: 
			setRoot(root);
			yesBtn = (RadioButton) root.lookup("#yesBtn");
			if(yesBtn.isSelected()) {
				TestResult.yesSum++;
			}
			commonServ = new CommonServiceImpl();
			commonServ.showWindow(s, "../fxml/Test3quiz5Form.fxml");
			commonServ.windowClose(event);
			break;	
		}
	}

	public void Quiz6(ActionEvent event) {
		Stage s = new Stage();
		RadioButton yesBtn = null;
		switch(TestResult.testNum) {
		case 1:
			setRoot(root);
			yesBtn = (RadioButton) root.lookup("#yesBtn");
			if(yesBtn.isSelected()) {
				TestResult.yesSum++;
			}
			commonServ = new CommonServiceImpl();
			commonServ.showWindow(s, "../fxml/Test1quiz6Form.fxml");
			commonServ.windowClose(event);
			break;

		case 2: 
			setRoot(root);
			yesBtn = (RadioButton) root.lookup("#yesBtn");
			if(yesBtn.isSelected()) {
				TestResult.yesSum++;
			}
			commonServ = new CommonServiceImpl();
			commonServ.showWindow(s, "../fxml/Test2quiz6Form.fxml");
			commonServ.windowClose(event);
			break;

		case 3: 
			setRoot(root);
			yesBtn = (RadioButton) root.lookup("#yesBtn");
			if(yesBtn.isSelected()) {
				TestResult.yesSum++;
			}
			commonServ = new CommonServiceImpl();
			commonServ.showWindow(s, "../fxml/Test3quiz6Form.fxml");
			commonServ.windowClose(event);
			break;	
		}
	}

	public void Result(ActionEvent event) {

		Stage s = new Stage();
		RadioButton yesBtn = null;

		Member m = new Member();

		switch(TestResult.testNum) {
		case 1:	
			setRoot(root);
			yesBtn = (RadioButton) root.lookup("#yesBtn");
			if(yesBtn.isSelected()) {
				TestResult.yesSum++;
			}
			if(Server.loginFlag) {
				switch(TestResult.yesSum) {
				case 6: 
					commonServ.showWindow(s, "../fxml/Test1Res1Form.fxml");
					commonServ.windowClose(event);
					m.setTest1Res(1);
					TestResult.result = 1;
					testServ.modifyTest1Res1Percent();
					break;
				case 5: 
					commonServ.showWindow(s, "../fxml/Test1Res2Form.fxml");
					commonServ.windowClose(event);
					m.setTest1Res(2);
					TestResult.result = 2;
					testServ.modifyTest1Res2Percent();
					break;
				case 4: 
					commonServ.showWindow(s, "../fxml/Test1Res2Form.fxml");
					commonServ.windowClose(event);
					m.setTest1Res(2);
					TestResult.result = 2;
					testServ.modifyTest1Res2Percent();
					break;
				case 3: 
					commonServ.showWindow(s, "../fxml/Test1Res2Form.fxml");
					commonServ.windowClose(event);
					m.setTest1Res(2);
					TestResult.result = 2;
					testServ.modifyTest1Res2Percent();
					break;
				case 2: 
					commonServ.showWindow(s, "../fxml/Test1Res3Form.fxml");
					commonServ.windowClose(event);
					m.setTest1Res(3);
					TestResult.result = 3;
					testServ.modifyTest1Res3Percent();
					break;
				case 1: 
					commonServ.showWindow(s, "../fxml/Test1Res3Form.fxml");
					commonServ.windowClose(event);
					m.setTest1Res(3);
					TestResult.result = 3;
					testServ.modifyTest1Res3Percent();
					break;
				case 0: 
					commonServ.showWindow(s, "../fxml/Test1Res3Form.fxml");
					commonServ.windowClose(event);
					m.setTest1Res(3);
					TestResult.result = 3;
					testServ.modifyTest1Res3Percent();
					break;
				}
				testServ.modifyTest1Res(m);


			}else {
				switch(TestResult.yesSum) {
				case 6: 
					TestResult.result = 1;
					testServ.modifyTest1Res1Percent();
					break;
				case 5: 
					TestResult.result = 2;
					testServ.modifyTest1Res2Percent();
					break;
				case 4: 
					TestResult.result = 2;
					testServ.modifyTest1Res2Percent();
					break;
				case 3: 
					TestResult.result = 2;
					testServ.modifyTest1Res2Percent();
					break;
				case 2: 
					TestResult.result = 3;
					testServ.modifyTest1Res3Percent();
					break;
				case 1: 
					TestResult.result = 3;
					testServ.modifyTest1Res3Percent();
					break;
				case 0: 
					TestResult.result = 3;
					testServ.modifyTest1Res3Percent();
					break;
				}
				Stage s2 = new Stage();
				commonServ.showWindow(s2, "../fxml/TestResLoginForm.fxml");
				commonServ.windowClose(event);
			}
			break;		
		case 2: 
			setRoot(root);
			yesBtn = (RadioButton) root.lookup("#yesBtn");
			if(yesBtn.isSelected()) {
				TestResult.yesSum++;
			}
			if(Server.loginFlag) {
				switch(TestResult.yesSum) {
				case 6: 
					commonServ.showWindow(s, "../fxml/test2Res1Form.fxml");
					commonServ.windowClose(event);
					m.setTest2Res(1);
					TestResult.result = 1;
					testServ.modifyTest2Res1Percent();
					break;
				case 5: 
					commonServ.showWindow(s, "../fxml/test2Res2Form.fxml");
					commonServ.windowClose(event);
					m.setTest2Res(2);
					TestResult.result = 2;
					testServ.modifyTest2Res2Percent();
					break;
				case 4: 
					commonServ.showWindow(s, "../fxml/test2Res2Form.fxml");
					commonServ.windowClose(event);
					m.setTest2Res(2);
					TestResult.result = 2;
					testServ.modifyTest2Res2Percent();
					break;
				case 3: 
					commonServ.showWindow(s, "../fxml/test2Res2Form.fxml");
					commonServ.windowClose(event);
					m.setTest2Res(2);
					TestResult.result = 2;
					testServ.modifyTest2Res2Percent();
					break;
				case 2: 
					commonServ.showWindow(s, "../fxml/test2Res3Form.fxml");
					commonServ.windowClose(event);
					m.setTest2Res(3);
					TestResult.result = 3;
					testServ.modifyTest2Res3Percent();
					break;
				case 1: 
					commonServ.showWindow(s, "../fxml/test2Res3Form.fxml");
					commonServ.windowClose(event);
					m.setTest2Res(3);
					TestResult.result = 3;
					testServ.modifyTest2Res3Percent();
					break;
				case 0: 
					commonServ.showWindow(s, "../fxml/test2Res3Form.fxml");
					commonServ.windowClose(event);
					m.setTest2Res(3);
					TestResult.result = 3;
					testServ.modifyTest2Res3Percent();
					break;
				}
				testServ.modifyTest2Res(m);


			}else {
				switch(TestResult.yesSum) {
				case 6: 
					TestResult.result = 1;
					testServ.modifyTest2Res1Percent();
					break;
				case 5: 
					TestResult.result = 2;
					testServ.modifyTest2Res2Percent();
					break;
				case 4: 
					TestResult.result = 2;
					testServ.modifyTest2Res2Percent();
					break;
				case 3: 
					TestResult.result = 2;
					testServ.modifyTest2Res2Percent();
					break;
				case 2: 
					TestResult.result = 3;
					testServ.modifyTest2Res3Percent();
					break;
				case 1: 
					TestResult.result = 3;
					testServ.modifyTest2Res3Percent();
					break;
				case 0: 
					TestResult.result = 3;
					testServ.modifyTest2Res3Percent();
					break;
				}
				Stage s2 = new Stage();
				commonServ.showWindow(s2, "../fxml/TestResLoginForm.fxml");
				commonServ.windowClose(event);
			}
			break;
		case 3: 
			setRoot(root);
			yesBtn = (RadioButton) root.lookup("#yesBtn");
			if(yesBtn.isSelected()) {
				TestResult.yesSum++;
			}
			if(Server.loginFlag) {
				switch(TestResult.yesSum) {
				case 6: 
					commonServ.showWindow(s, "../fxml/test3Res1Form.fxml");
					commonServ.windowClose(event);
					m.setTest3Res(1);
					TestResult.result = 1;
					testServ.modifyTest3Res1Percent();
					break;
				case 5: 
					commonServ.showWindow(s, "../fxml/test3Res2Form.fxml");
					commonServ.windowClose(event);
					m.setTest3Res(2);
					TestResult.result = 2;
					testServ.modifyTest3Res2Percent();
					break;
				case 4: 
					commonServ.showWindow(s, "../fxml/test3Res2Form.fxml");
					commonServ.windowClose(event);
					m.setTest3Res(2);
					TestResult.result = 2;
					testServ.modifyTest3Res2Percent();
					break;
				case 3: 
					commonServ.showWindow(s, "../fxml/test3Res2Form.fxml");
					commonServ.windowClose(event);
					m.setTest3Res(2);
					TestResult.result = 2;
					testServ.modifyTest3Res2Percent();
					break;
				case 2: 
					commonServ.showWindow(s, "../fxml/test3Res3Form.fxml");
					commonServ.windowClose(event);
					m.setTest3Res(3);
					TestResult.result = 3;
					testServ.modifyTest3Res3Percent();
					break;
				case 1: 
					commonServ.showWindow(s, "../fxml/test3Res3Form.fxml");
					commonServ.windowClose(event);
					m.setTest3Res(3);
					TestResult.result = 3;
					testServ.modifyTest3Res3Percent();
					break;
				case 0: 
					commonServ.showWindow(s, "../fxml/test3Res3Form.fxml");
					commonServ.windowClose(event);
					m.setTest3Res(3);
					TestResult.result = 3;
					testServ.modifyTest3Res3Percent();
					break;
				}
				testServ.modifyTest3Res(m);


			}else {
				switch(TestResult.yesSum) {
				case 6: 
					TestResult.result = 1;
					testServ.modifyTest3Res1Percent();
					break;
				case 5: 
					TestResult.result = 2;
					testServ.modifyTest3Res2Percent();
					break;
				case 4: 
					TestResult.result = 2;
					testServ.modifyTest3Res2Percent();
					break;
				case 3: 
					TestResult.result = 2;
					testServ.modifyTest3Res2Percent();
					break;
				case 2: 
					TestResult.result = 3;
					testServ.modifyTest3Res3Percent();
					break;
				case 1: 
					TestResult.result = 3;
					testServ.modifyTest3Res3Percent();
					break;
				case 0: 
					TestResult.result = 3;
					testServ.modifyTest3Res3Percent();
					break;
				}
				Stage s2 = new Stage();
				commonServ.showWindow(s2, "../fxml/TestResLoginForm.fxml");
				commonServ.windowClose(event);
			}
			break;	
		}
	}

	public void loginForm(ActionEvent event) {
		Stage s = new Stage();
		commonServ.showWindow(s, "../fxml/LoginForm.fxml");
		commonServ.windowClose(event);
	}

	public void resultForm(ActionEvent event) {
		Stage s = new Stage();

		RadioButton yesBtn = null;

		setRoot(root);
		yesBtn = (RadioButton) root.lookup("#yesBtn");
		if(yesBtn.isSelected()) {
			TestResult.yesSum++;
		}

		switch(TestResult.yesSum) {
		case 6: 
			TestResult.result = 1;
			testServ.modifyTest1Res1Percent();
			break;
		case 5: 
			TestResult.result = 2;
			testServ.modifyTest1Res2Percent();
			break;
		case 4: 
			TestResult.result = 2;
			testServ.modifyTest1Res2Percent();
			break;
		case 3: 
			TestResult.result = 2;
			testServ.modifyTest1Res2Percent();
			break;
		case 2: 
			TestResult.result = 3;
			testServ.modifyTest1Res3Percent();
			break;
		case 1: 
			TestResult.result = 3;
			testServ.modifyTest1Res3Percent();
			break;
		case 0: 
			TestResult.result = 3;
			testServ.modifyTest1Res3Percent();
			break;
		}

		switch(TestResult.testNum) {
		case 1 :
			switch(TestResult.result) {
			case 1: 
				commonServ.showWindow(s, "../fxml/Test1Res1Form.fxml");
				commonServ.windowClose(event); 
				break;
			case 2:
				commonServ.showWindow(s, "../fxml/Test1Res2Form.fxml");
				commonServ.windowClose(event); 
				break;
			case 3: 
				commonServ.showWindow(s, "../fxml/Test1Res3Form.fxml");
				commonServ.windowClose(event); 
				break;
			}
			break;
		case 2 : 
			switch(TestResult.result) {
			case 1: 
				commonServ.showWindow(s, "../fxml/Test2Res1Form.fxml");
				commonServ.windowClose(event); 
				break;
			case 2:
				commonServ.showWindow(s, "../fxml/Test2Res2Form.fxml");
				commonServ.windowClose(event); 
				break;
			case 3: 
				commonServ.showWindow(s, "../fxml/Test2Res3Form.fxml");
				commonServ.windowClose(event); 
				break;
			}
			break;
		case 3 : 
			switch(TestResult.result) {
			case 1: 
				commonServ.showWindow(s, "../fxml/Test3Res1Form.fxml");
				commonServ.windowClose(event); 
				break;
			case 2:
				commonServ.showWindow(s, "../fxml/Test3Res2Form.fxml");
				commonServ.windowClose(event); 
				break;
			case 3: 
				commonServ.showWindow(s, "../fxml/Test3Res3Form.fxml");
				commonServ.windowClose(event); 
				break;
			}
			break;
		}
	}

	public void AllRes(ActionEvent event) {
		Stage s = new Stage();
		Parent root = null;
		TestPercent tp = new TestPercent();
		TextField percent1Tf;
		TextField percent2Tf;
		TextField percent3Tf;
		switch(TestResult.testNum) {
		case 1 : 
			root = commonServ.showWindow(s, "../fxml/Test1AllResForm.fxml");
			commonServ.windowClose(event);
			tp = testServ.selectTest1Res();

			percent1Tf = (TextField) root.lookup("#percent1Tf");
			percent2Tf = (TextField) root.lookup("#percent2Tf");
			percent3Tf = (TextField) root.lookup("#percent3Tf");

			percent1Tf.setText( Integer.toString( tp.getRes1Percent() ) );
			percent2Tf.setText(	Integer.toString( tp.getRes2Percent() ) );
			percent3Tf.setText(	Integer.toString( tp.getRes3Percent() ) );

			break;
		case 2 :
			root = commonServ.showWindow(s, "../fxml/Test2AllResForm.fxml");
			commonServ.windowClose(event);
			tp = testServ.selectTest2Res();

			percent1Tf = (TextField) root.lookup("#percent1Tf");
			percent2Tf = (TextField) root.lookup("#percent2Tf");
			percent3Tf = (TextField) root.lookup("#percent3Tf");

			percent1Tf.setText( Integer.toString( tp.getRes1Percent() ) );
			percent2Tf.setText(	Integer.toString( tp.getRes2Percent() ) );
			percent3Tf.setText(	Integer.toString( tp.getRes3Percent() ) );

			break;
		case 3 :
			root = commonServ.showWindow(s, "../fxml/Test3AllResForm.fxml");
			commonServ.windowClose(event);
			tp = testServ.selectTest3Res();

			percent1Tf = (TextField) root.lookup("#percent1Tf");
			percent2Tf = (TextField) root.lookup("#percent2Tf");
			percent3Tf = (TextField) root.lookup("#percent3Tf");

			percent1Tf.setText( Integer.toString( tp.getRes1Percent() ) );
			percent2Tf.setText(	Integer.toString( tp.getRes2Percent() ) );
			percent3Tf.setText(	Integer.toString( tp.getRes3Percent() ) );

			break;
		}
	}

	public void BackRes(ActionEvent event) {
		Stage s = new Stage();
		switch(TestResult.testNum) {
		case 1 : 
			switch(TestResult.result) {
			case 1 : 
				commonServ.showWindow(s, "../fxml/Test1Res1Form.fxml");
				commonServ.windowClose(event);
				break;
			case 2 :
				commonServ.showWindow(s, "../fxml/Test1Res2Form.fxml");
				commonServ.windowClose(event);
				break;
			case 3 :
				commonServ.showWindow(s, "../fxml/Test1Res3Form.fxml");
				commonServ.windowClose(event);
				break;
			}
			break;
		case 2 : 
			switch(TestResult.result) {
			case 1 : 
				commonServ.showWindow(s, "../fxml/Test2Res1Form.fxml");
				commonServ.windowClose(event);
				break;
			case 2 :
				commonServ.showWindow(s, "../fxml/Test2Res2Form.fxml");
				commonServ.windowClose(event);
				break;
			case 3 :
				commonServ.showWindow(s, "../fxml/Test2Res3Form.fxml");
				commonServ.windowClose(event);
				break;
			}
			break;
		case 3 : 
			switch(TestResult.result) {
			case 1 : 
				commonServ.showWindow(s, "../fxml/Test3Res1Form.fxml");
				commonServ.windowClose(event);
				break;
			case 2 :
				commonServ.showWindow(s, "../fxml/Test3Res2Form.fxml");
				commonServ.windowClose(event);
				break;
			case 3 :
				commonServ.showWindow(s, "../fxml/Test3Res3Form.fxml");
				commonServ.windowClose(event);
				break;
			}
			break;
		}
	}

}
