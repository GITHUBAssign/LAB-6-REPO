package application;

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
	@Override
	public void start(Stage stage) throws IOException {
//using  Two text fieilds
		Text label1 = new Text("User ID");

		Text label2 = new Text("Password");
//textfield for user to enter user name
		TextField textField1 = new TextField();
//password field for user to enter password
		PasswordField textField2 = new PasswordField();
//using submit button to send data to server
		Button Sbutton1 = new Button("Submit");
//using grid pane to layout data in rows and columns
		GridPane gridPane = new GridPane();
//using setMinSize method to set size of gridpane window
		gridPane.setMinSize(450, 250);

		gridPane.setPadding(new Insets(12, 12, 12, 12));

		gridPane.setVgap(7);
		gridPane.setHgap(7);

		gridPane.setAlignment(Pos.CENTER);
//formating all feilds in gridpane's rows and column
		gridPane.add(label1, 0, 0);
		gridPane.add(textField1, 1, 0);
		gridPane.add(label2, 0, 1);
		gridPane.add(textField2, 1, 1);
		gridPane.add(Sbutton1, 0, 2);

		textField1.setStyle("-fx-font: Arial bold 20px 'serif'");
		textField2.setStyle("-fx-font: Arial bold 20px 'serif'");

		label1.setStyle("-fx-font: Arial bold 20px 'serif'");
		label2.setStyle("-fx-font: Arial bold 20px 'serif'");

		Sbutton1.setStyle(
				"-fx-background-color:rgb(51, 255, 51); -fx-text-fill: black;-fx-font: Arial bold 20px 'serif' ");
//Scene is a container which contain all data
		Scene scene = new Scene(gridPane);

		stage.setTitle("Login Page");

		stage.setScene(scene);

		stage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
