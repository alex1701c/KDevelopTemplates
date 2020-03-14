package main;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label helloWorldLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if(resources != null){
            helloWorldLabel.setText(resources.getString("message"));
        }else {
            helloWorldLabel.setText("Hello Default!");
        }
    }
}
