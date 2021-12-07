package sample.controllers;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Controller {

    public static void insertImage(ImageView imageView, String path) {
        Image image = new Image(new File(path).toURI().toString());
        imageView.setImage(image);
    }

    public static void setScreen(Stage primaryStage, String title, Parent root) throws IOException {
      //  Parent root = FXMLLoader.load(Objects.requireNonNull(SetupController.class.getResource("/sample/resources/stages/setup.fxml")));
        primaryStage.setTitle(title);
        primaryStage.setScene(new Scene(root));

        primaryStage.show();
    }
}
