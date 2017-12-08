import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Controller1 extends EastController{
	@FXML
	private Button btnNeeded;
	@FXML
	private Button btnStart;
	@FXML
	private Button btnCheck;
	@FXML
	Label text;
	@FXML
	Label Emptybag;
	@FXML
	public void BackPackStatus(){
		if(getItems().contains(Tarp)||getItems().contains(Oar)||getItems().contains(Vest)){
			btnNeeded.setOnAction((event) -> {
				System.out.printf("Button Action: btnNeeded is pressed. \n");
				text.setText(""+getItems()+"");
				text.setAlignment(Pos.TOP_CENTER);
			});
		}else{
			Emptybag.setText("Bag is Empty");
			Emptybag.setAlignment(Pos.TOP_CENTER);
		}
	}
	@FXML
	public void BackPackIsFull(){
		// Handle Button event.
		btnCheck.setOnAction((event) -> {
			System.out.printf("Button Action: btnCheck is pressed. \n");

			Parent root;
			try {
				if(getItems().size()<3){
					root = FXMLLoader.load(getClass().getResource("ReturnUser.fxml"));
					Scene scene = new Scene(root);
					Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
					appStage.setScene(scene);
					appStage.show();

				}

				if(getItems().size()==3){
					root = FXMLLoader.load(getClass().getResource("Sail.fxml"));
					Scene scene = new Scene(root);
					Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
					appStage.setScene(scene);
					appStage.show();
				}
			} catch (IOException e) {
				e.printStackTrace();
				System.out.printf("*** f1.fxml could not be loaded :(");
			}
		});
	}
	@FXML
	private void initialize(){

		// Handle Button event.
		btnStart.setOnAction((event) -> {
			System.out.printf("Button Action: btnStart is pressed. \n");

			//load the second fxml:
			Parent f1;
			try {
				f1 = FXMLLoader.load(getClass().getResource("field.fxml"));
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

