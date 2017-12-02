package controller;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

/**
 * 
 * @author Pablo Hidalgo Martínez
 * @see Main
 * @see MainLayout
 *
 */
public class Controller {

	@FXML
	private ImageView ivRedSymbol, ivBlackSymbol;

	/**
	 * Method to set visible the Red Mandalorian symbol and hide the Black one so
	 * both pictures are not showed at the same time. This method is used at
	 * MainLayout : "btnRedSymbol" button.
	 * 
	 */
	@FXML
	public void showRedSymbol() {
		ivBlackSymbol.setVisible(false);
		ivRedSymbol.setVisible(true);
	}

	/**
	 * Method to set visible the Black Mandalorian symbol and hide the Red one so
	 * both pictures are not showed at the same time.This method is used at
	 * MainLayout : "btnBlackSymbol" button.
	 * 
	 */
	@FXML
	public void showBlackSymbol() {
		ivRedSymbol.setVisible(false);
		ivBlackSymbol.setVisible(true);
	}

}
