package dayeun;


import dayeun.service.CommonService;
import dayeun.service.CommonServiceImpl;
import javafx.application.Application;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TestVillageMain extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		//////////////////////////////폰트 추가///////////////////////////////////////
        System.setProperty("prism.lcdtext", "false"); // 폰트파일 로드전에 실행                
        Font.loadFont(getClass().getResourceAsStream("../font/NotoSansKR-Medium.otf"), 10); //폰트 추가
        ////////////////////////////////////////////////////////////////////
		CommonService comServ = new CommonServiceImpl();
		comServ.showWindow(primaryStage, "../fxml/MainForm.fxml"); //fxml패키지의 MainForm열기
	}//start

	public static void main(String[] args) {
		launch(args);
	}//main
}//class
