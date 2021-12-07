package sample.controllers;

import animatefx.animation.LightSpeedIn;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import sample.Main;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import static sample.controllers.Controller.setScreen;
import static sample.controllers.SetupController.getSetupRoot;


public class MainController implements Initializable {

    @FXML
    private Label mainLabel;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button buttonPlay;

    public static Parent getMainRoot() throws IOException {
        return FXMLLoader.load(Objects.requireNonNull(MainController.class.getResource("/sample/resources/stages/main.fxml")));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        new LightSpeedIn(mainLabel).play();
        buttonPlay.setOnAction(e -> {
            try {
                setScreen(Main.getPrimaryStage(), "Race", getSetupRoot());
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
    }
}
