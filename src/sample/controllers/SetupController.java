package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import static sample.controllers.Controller.insertImage;

public class SetupController implements Initializable {

    @FXML
    private ImageView imageView;

    public static Parent getSetupRoot() throws IOException {
        return FXMLLoader.load(Objects.requireNonNull(RaceController.class.getResource("/sample/resources/stages/setup.fxml")));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        insertImage(imageView,"src/sample/resources/images/cropped.gif");
    }

}
