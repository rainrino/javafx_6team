package jungeun.mainAndClass;

import javafx.application.Application;
import javafx.stage.Stage;
import jungeun.service.CommonService;
import jungeun.service.CommonServiceImpl;

public class jun01 extends Application{
	// jungeun 패키지 메인 클래스
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		CommonService comServ = new CommonServiceImpl();
		comServ.showWindow(primaryStage, "../aaa.fxml");
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
