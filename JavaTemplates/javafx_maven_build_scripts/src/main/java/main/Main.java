package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ResourceBundle;

public class Main extends Application {

    @Override
    public void start(Stage window) throws Exception{
        ResourceBundle bundle = ResourceBundle.getBundle("translations");
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"), bundle);
        window.setTitle("Hello World");
        window.setScene(new Scene(root, 300, 275));
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
