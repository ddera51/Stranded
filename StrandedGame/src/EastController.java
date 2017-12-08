import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public  class EastController implements BackPackInterface{

	@FXML
	private Button btnInside;
	@FXML
	private Button btnSadForest;
	@FXML
	private Button btnForest;
	@FXML
	private Button btnChurch;
	@FXML
	private Button btneCabin;
	@FXML
	private Button btnToMtns;
	@FXML
	private Button btnToWreck;
	@FXML
	private Button btnReturn;
	@FXML
	private Button btnOar;
	@FXML
	private Button btnTarp;
	@FXML
	private Button btnLifeVest;
	@FXML
	private Button btnCheck;
	@FXML
	private Button btnCompass;
	@FXML
	Label Tarp1;
	@FXML
	Label Tarp2;
	@FXML
	Label oar1;
	@FXML
	Label oar2;
	@FXML
	Label Vest1;
	@FXML
	Label Vest2;
	@FXML
	Label Compass1;
	int tPressed=0;
	@FXML
	public void getTarp(){

		// Handle Button event.
		if(!items.contains(Tarp)){
			btnTarp.setOnAction((event) -> {
				System.out.printf("Button Action: btnTarp is pressed. \n");
				items.add(Tarp);
				Tarp1.setText("You picked up the tarp!");
				Tarp1.setAlignment(Pos.TOP_CENTER);
				tPressed ++;
				if(tPressed>1){	
					items.remove(Tarp);
				}
			});
		}
		else {
			btnTarp.setOnAction((event) -> {
				Tarp2.setText("You already picked up the Tarp!");
				Tarp2.setAlignment(Pos.TOP_CENTER);	
			});
		}	
	}
	@FXML
	public void getOar(){
		if(!items.contains(Oar)){
			btnOar.setOnAction((event) -> {
				System.out.printf("Button Action: btnOar is pressed. \n");
				items.add(Oar);
				oar1.setText("You picked up the Oar!");
				oar1.setAlignment(Pos.TOP_CENTER);
				tPressed++;
				if(tPressed>1){	
					items.remove(Oar);
				}
			});
		}
		else{
			btnOar.setOnAction((event) -> {
				oar2.setText("You already picked up the oar!");
				oar2.setAlignment(Pos.TOP_CENTER);	
			});
		}	
	}
	@FXML
	public void getLifeVest(){
		if(!items.contains(Vest)){
			btnLifeVest.setOnAction((event) -> {
				System.out.printf("Button Action: btnLifeVest is pressed. \n");
				items.add(Vest);
				Vest1.setText("You picked up the Life Vest!");
				Vest1.setAlignment(Pos.TOP_CENTER);
				tPressed++;
				if(tPressed>1){	
					items.remove(Vest);
				}
			});
		}
		else{
			btnLifeVest.setOnAction((event) -> {
				Vest2.setText("You already picked up the life vest!");
				Vest2.setAlignment(Pos.TOP_CENTER);			
			});
		}	
	}
	@FXML
	public void getCompass(){
		// Handle Button event.
		if(!items.contains(Compass)){
			btnCompass.setOnAction((event) -> {
				System.out.printf("Button Action: btnCompass is pressed. \n");
				Compass1.setText("It's broken, you drop it");
				Compass1.setAlignment(Pos.TOP_CENTER);	
				items.add(Compass);
				if(tPressed>=0){
					items.remove(Compass);
				}
			});
		}
		else{
			btnCompass.setOnAction((event) -> {
				Compass1.setText("It's broken, you drop it");
				Compass1.setAlignment(Pos.TOP_CENTER);	
			});
		}
	}

	public ArrayList<String> getItems(){
		return items;
	}

	@FXML
	public void church(){
		// Handle Button event.
		btnChurch.setOnAction((event) -> {
			System.out.printf("Button Action: btnChurch is pressed. \n");

			//load the second fxml:
			Parent root;
			try {
				root = FXMLLoader.load(getClass().getResource("Church.fxml"));
				Scene scene = new Scene(root);
				Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				appStage.setScene(scene);
				appStage.show();
				System.out.println(Arrays.toString(items.toArray()));
			} catch (IOException e) {
				e.printStackTrace();
				System.out.printf("*** f1.fxml could not be loaded :(");
			}
		});

	}
	@FXML
	public void inside(){

		// Handle Button event.
		btnInside.setOnAction((event) -> {
			System.out.printf("Button Action: btnInside is pressed. \n");

			//load the second fxml:
			Parent root;
			try {
				root = FXMLLoader.load(getClass().getResource("innerChurch.fxml"));
				Scene scene = new Scene(root);
				Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				appStage.setScene(scene);
				appStage.show();
				System.out.println(Arrays.toString(items.toArray()));
			} catch (IOException e) {
				e.printStackTrace();
				System.out.printf("*** f1.fxml could not be loaded :(");
			}
		});
	}
	@FXML
	public void sadforest(){

		// Handle Button event.
		btnSadForest.setOnAction((event) -> {
			System.out.printf("Button Action: btnSadForest is pressed. \n");

			//load the second fxml:
			Parent root;
			try {
				root = FXMLLoader.load(getClass().getResource("sadForest.fxml"));
				Scene scene = new Scene(root);
				Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				appStage.setScene(scene);
				appStage.show();
				System.out.println(Arrays.toString(items.toArray()));
			} catch (IOException e) {
				e.printStackTrace();
				System.out.printf("*** f1.fxml could not be loaded :(");
			}
		});

	}
	@FXML
	public void exitChurch(){

		// Handle Button event.
		btnForest.setOnAction((event) -> {
			System.out.printf("Button Action: btnForest is pressed. \n");

			//load the second fxml:
			Parent root;
			try {
				root = FXMLLoader.load(getClass().getResource("forest.fxml"));
				Scene scene = new Scene(root);
				Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				appStage.setScene(scene);
				appStage.show();
				System.out.println(Arrays.toString(items.toArray()));
			} catch (IOException e) {
				e.printStackTrace();
				System.out.printf("*** f1.fxml could not be loaded :(");
			}
		});

	}
	@FXML
	public void enterCabin(){

		// Handle Button event.
		btneCabin.setOnAction((event) -> {
			System.out.printf("Button Action: btneCabin is pressed. \n");

			//load the second fxml:
			Parent root;
			try {
				root = FXMLLoader.load(getClass().getResource("cabin.fxml"));
				Scene scene = new Scene(root);
				Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				appStage.setScene(scene);
				appStage.show();
				System.out.println(Arrays.toString(items.toArray()));
			} catch (IOException e) {
				e.printStackTrace();
				System.out.printf("*** f1.fxml could not be loaded :(");
			}
		});

	}
	@FXML
	public void pathPlane(){

		// Handle Button event.
		btnToMtns.setOnAction((event) -> {
			System.out.printf("Button Action: btneToMtns is pressed. \n");

			//load the second fxml:
			Parent root;
			try {
				root= FXMLLoader.load(getClass().getResource("CanbinO.fxml"));
				Scene scene = new Scene(root);
				Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				appStage.setScene(scene);
				appStage.show();
				System.out.println(Arrays.toString(items.toArray()));
			} catch (IOException e) {
				e.printStackTrace();
				System.out.printf("*** f1.fxml could not be loaded :(");
			}
		});

	}
	@FXML
	public void toPlane(){

		// Handle Button event.
		btnToWreck.setOnAction((event) -> {
			System.out.printf("Button Action: btneToMtns is pressed. \n");

			//load the second fxml:
			Parent root;
			try {
				root = FXMLLoader.load(getClass().getResource("PlaneWreck.fxml"));
				Scene scene = new Scene(root);
				Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				appStage.setScene(scene);
				appStage.show();
				System.out.println(Arrays.toString(items.toArray()));
			} catch (IOException e) {
				e.printStackTrace();
				System.out.printf("*** f1.fxml could not be loaded :(");
			}
		});

	}
	@FXML
	public void Field(){

		// Handle Button event.
		btnReturn.setOnAction((event) -> {
			System.out.printf("Button Action: btnReturn is pressed. \n");

			//load the second fxml:
			Parent root;
			try {
				root= FXMLLoader.load(getClass().getResource("field.fxml"));
				Scene scene = new Scene(root);
				Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				appStage.setScene(scene);
				appStage.show();
				System.out.println(Arrays.toString(items.toArray()));
			} catch (IOException e) {
				e.printStackTrace();
				System.out.printf("*** f1.fxml could not be loaded :(");
			}
		});

	}
}
