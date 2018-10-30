package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Mateusz Marczuk
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 30.10.2018.
 */
public class SignupController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private CheckBox SignUpCheckboxMale;

    @FXML
    private TextField SignUpUsername;

    @FXML
    private TextField SignUpFirstName;

    @FXML
    private PasswordField SignUpPassword;

    @FXML
    private CheckBox SignUpCheckboxFemale;

    @FXML
    private TextField SignUpLastName;

    @FXML
    private TextField SignUpLocation;

    @FXML
    private Button SignUpButtonSignUp;


    @FXML
    private Button SignUpButtonBack;

    @FXML
    void eeeeee(ActionEvent event) {

    }

    @FXML
    void initialize() {

        SignUpButtonBack.setOnAction(event -> {
            SignUpButtonBack.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/view/login.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("ASdasdasdad");
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

    }

}
