import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BoatController extends EastController {
	@FXML
	private Button btnSail;
	@FXML
	private Button btnTown;
	@FXML
	private Button btnTheEnd;
	@FXML
	private Button btnStart;

	@FXML
	private void SetSail(){

		// Handle Button event.
		btnSail.setOnAction((event) -> {
			System.out.printf("Button Action: btnStart is pressed. \n");

			//load the second fxml:
			Parent f1;
			try {
				f1 = FXMLLoader.load(getClass().getResource("GoToTown.fxml"));
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
	private void ToTown(){

		// Handle Button event.
		btnTown.setOnAction((event) -> {
			System.out.printf("Button Action: btnStart is pressed. \n");

			//load the second fxml:
			Parent f1;
			try {
				f1 = FXMLLoader.load(getClass().getResource("TheEnd.fxml"));
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
	private void TheEnd(){

		// Handle Button event.
		btnTheEnd.setOnAction((event) -> {
			System.out.printf("Button Action: btnTheEnd is pressed. \n");

			//load the second fxml:
			Parent f1;
			try {
				f1 = FXMLLoader.load(getClass().getResource("Credits.fxml"));
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
	public void PlayAgin(){
		// Handle Button event.
		
		btnStart.setOnAction((event) -> {
			System.out.printf("Button Action: btnStart is pressed. \n");

			//load the second fxml:
			Parent root;
			try {
				root = FXMLLoader.load(getClass().getResource("Startmenu.fxml"));
				Scene scene = new Scene(root);
				Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				appStage.setScene(scene);
				appStage.show();
				getItems().clear();

			} catch (IOException e) {
				e.printStackTrace();
				System.out.printf("*** f1.fxml could not be loaded :(");
			}
		});

	}
}
