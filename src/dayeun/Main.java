package dayeun;

import dayeun.service.CommonService;
import dayeun.service.CommonServiceImpl;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		////////////////////////////폰트적용////////////////////////////////////////////////////////////////////////////////
        System.setProperty("prism.lcdtext", "false"); // 폰트파일 로드전에 실행                
        //Font.loadFont(getClass().getResourceAsStream("/font/NotoSansKR-Medium.otf"), 10);
        String font="";
        font=Font.loadFont(getClass().getResourceAsStream("/font/NotoSansKR-Bold.otf"), 16).getFamily();
//        System.out.println(font);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		CommonService comServ = new CommonServiceImpl();
		comServ.showWindow(primaryStage, "../fxml/MainForm.fxml");
	}//start
	
	public static void main(String[] args) {
		launch(args);
	}//main


}//class
