package main;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) {
        GridPane parent = new GridPane();
        parent.setAlignment(Pos.CENTER);
        parent.getChildren().add(new Label("Hello World!"));
        Scene scene = new Scene(parent, 400,200);
        window.setScene(scene);
        window.show();
    }
}
