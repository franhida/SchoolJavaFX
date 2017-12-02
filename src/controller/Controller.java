package controller;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class Controller {

	@FXML
	private ImageView ivRedSymbol, ivBlackSymbol;

	@FXML
	public void showRedSymbol() {
		ivBlackSymbol.setVisible(false);
		ivRedSymbol.setVisible(true);
	}

	@FXML
	public void showBlackSymbol() {
		ivRedSymbol.setVisible(false);
		ivBlackSymbol.setVisible(true);
	}

	@FXML
	private void initialize() {

	}
}
