import java.util.ArrayList;


public interface BackPackInterface {

	String Tarp = "Tarp";
	String Oar = "Oar";
	String Vest = "Life vest";
	String Compass = "Compass";
	ArrayList<String> items = new ArrayList<String>(4);

	

	void getTarp();
	void getOar();
	void getLifeVest();
	void getCompass();
	ArrayList<String> getItems();
	

}
