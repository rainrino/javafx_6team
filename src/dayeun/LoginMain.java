package dayeun;


import dayeun.service.CommonService;
import dayeun.service.CommonServiceImpl;
import javafx.application.Application;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LoginMain extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		//////////////////////////////폰트 추가///////////////////////////////////////
        System.setProperty("prism.lcdtext", "false"); // 폰트파일 로드전에 실행                
        Font.loadFont(getClass().getResourceAsStream("../font/NotoSansKR-Medium.otf"), 10);
        ////////////////////////////////////////////////////////////////////
		CommonService comServ = new CommonServiceImpl();
		comServ.showWindow(primaryStage, "../fxml/LoginForm.fxml");
	}//start

	public static void main(String[] args) {
		launch(args);
	}//main
}//class
