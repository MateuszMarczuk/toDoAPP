package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
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

        String loginText = loginUserName.getText().trim();
        String loginPwd = loginPassword.getText().trim();

        loginSignUpButton.setOnAction(event -> {
            loginSignUpButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/view/signup.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        loginButton.setOnAction(event -> {
            if (!loginText.equals("") || !loginPwd.equals("")){
                loginUser(loginText,loginPwd);
            } else {
                System.out.println("Error login ");
            }

        });
    }

    private void loginUser(String userName, String password) {

    }

}
