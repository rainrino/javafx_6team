package jungeun.service;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import jungeun.mainAndClass.TestResult;

public interface TestService {
//	public List<TestResult> nextTest(Parent root, ActionEvent event);
	public String nextTest(Parent root, ActionEvent event);
	public void resultTest(Parent root);
}
