import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FieldController {
	@FXML 
	private Button btnNorth;
	@FXML
	private Button btnSouth;
	@FXML
	private Button btnEast;
	@FXML
	private Button btnWest;
	@FXML
	private Button btnReturn;
	@FXML
	private void North(){

		// Handle Button event.
		btnNorth.setOnAction((event) -> {
			System.out.printf("Button Action: btnStart is pressed. \n");

			//load the second fxml:
			Parent f1;
			try {
				f1 = FXMLLoader.load(getClass().getResource("NorthMtns.fxml"));
				Scene scene = new Scene(f1);
				Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				appStage.setScene(scene);
				appStage.show();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.printf("*** f1.fxml could not be loaded :(");
			}
		});

	}
	@FXML
	private void south(){
		// Handle Button event.
		btnSouth.setOnAction((event) -> {
			System.out.printf("Button Action: btnSouth is pressed. \n");

			//load the second fxml:
			Parent f1;
			try {
				f1 = FXMLLoader.load(getClass().getResource("SouthMtns.fxml"));
				Scene scene = new Scene(f1);
				Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				appStage.setScene(scene);
				appStage.show();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.printf("*** f1.fxml could not be loaded :(");
			}
		});
	}
	@FXML
	private void east(){
		// Handle Button event.
		btnEast.setOnAction((event) -> {
			System.out.printf("Button Action: btnEast is pressed. \n");

			//load the second fxml:
			Parent f1;
			try {
				f1 = FXMLLoader.load(getClass().getResource("eastPath.fxml"));
				Scene scene = new Scene(f1);
				Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				appStage.setScene(scene);
				appStage.show();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.printf("*** f1.fxml could not be loaded :(");
			}
		});
	}
	@FXML
	private void west(){
		// Handle Button event.
		btnWest.setOnAction((event) -> {
			System.out.printf("Button Action: btnWest is pressed. \n");

			//load the second fxml:
			Parent f1;
			try {
				f1 = FXMLLoader.load(getClass().getResource("Lake.fxml"));
				Scene scene = new Scene(f1);
				Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				appStage.setScene(scene);
				appStage.show();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.printf("*** f1.fxml could not be loaded :(");
			}
		});
	}
}

