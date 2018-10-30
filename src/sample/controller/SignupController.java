package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import sample.database.DatabaseHandler;

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
    void eeeeee(ActionEvent event) {

    }

    @FXML
    void initialize() {

        DatabaseHandler databaseHandler = new DatabaseHandler();

        SignUpButtonSignUp.setOnAction(event -> {

            databaseHandler.signUpUser(SignUpFirstName.getText(), SignUpLastName.getText(),
                SignUpUsername.getText(),SignUpPassword.getText(),  "Female", SignUpLocation.getText());
        });

    }

}
