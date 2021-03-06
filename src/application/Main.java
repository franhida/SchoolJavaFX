package application;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * 
 * @author Pablo Hidalgo Martínez
 * @version 1.0.0
 * @see Controller
 * @see MainLayout
 * Star Wars related simple App
 * @link http://www.jfoenix.com/documentation.html
 * @link https://github.com/franhida/SchoolJavaFX
 */
public class Main extends Application {
	private Stage stage;

	@FXML
	private JFXButton btnBlackSymbol, btnRedSymbol;
	private AnchorPane anchorPane;

	@Override
	public void start(Stage primaryStage) {
		this.stage = primaryStage;
		loadMainWindow();
	}

	protected void loadMainWindow() {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/MainLayout.fxml"));
		try {
			anchorPane = fxmlLoader.load();
			Scene scene = new Scene(anchorPane);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}
