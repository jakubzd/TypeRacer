package sample.controllers;

import animatefx.animation.FadeIn;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.random.RandomGenerator;


public class RaceController implements Initializable {

    @FXML
    private Label raceLabel;


    public static void setRaceScreen(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(RaceController.class.getResource("/sample/resources/stages/race.fxml")));
        primaryStage.setTitle("TypeRace");
        primaryStage.setScene(new Scene(root, 700, 450));

        primaryStage.show();
    }

    public static Parent getRaceRoot() throws IOException {
        return FXMLLoader.load(Objects.requireNonNull(RaceController.class.getResource("/sample/resources/stages/race.fxml")));
    }

    private String getEnglishText() throws IOException {
        var generator = RandomGenerator.of("L64X128MixRandom");
        List<String> lines = Files.readAllLines(Paths.get("src/sample/resources/texts/english.txt"));
        return lines.get(generator.nextInt(lines.size()));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            raceLabel.setText(getEnglishText());
            new FadeIn(raceLabel).play();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
