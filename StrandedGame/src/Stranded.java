import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Stranded extends Application{
	Button btnScene1, btnScene2;
	Label lblscene1,lblscene2;
	AnchorPane pane1,pane2;
	Scene scene1, scene2;
	Stage game;
	public void start(Stage primaryStage) throws Exception {

		game = primaryStage;
		Parent root = FXMLLoader.load(getClass().getResource("Startmenu.fxml"));
		Scene title = new Scene(root);
		
		game.setTitle("Stranded");
		game.setScene(title);
		game.show();
		
	}

	public static void main(String[] args){
		Application.launch(args);
			
	}
}
