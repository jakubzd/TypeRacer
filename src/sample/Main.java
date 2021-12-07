package sample;

import javafx.application.Application;
import javafx.stage.Stage;

import static sample.controllers.Controller.setScreen;
import static sample.controllers.MainController.getMainRoot;


public class Main extends Application {

    private static Stage primaryStage;

    public static Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void setPrimaryStage(Stage primaryStage) {
        Main.primaryStage = primaryStage;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        setPrimaryStage(primaryStage);
        primaryStage = Main.primaryStage;
        setScreen(primaryStage, "TypeRace", getMainRoot());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
