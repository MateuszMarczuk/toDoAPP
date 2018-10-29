package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField loginUserName;

    @FXML
    private Button loginButton;

    @FXML
    private Button loginSignUpButton;

    @FXML
    private TextField loginPassword;

    @FXML
    void eeeeee(ActionEvent event) {

    }

    @FXML
    void initialize() {
        loginButton.setOnAction(event -> {
            System.out.println("LOGIN");
        });
    }

}
