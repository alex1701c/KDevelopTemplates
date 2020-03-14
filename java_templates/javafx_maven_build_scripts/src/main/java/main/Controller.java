package main;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private JFXButton btn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if(resources != null){
            btn.setText(resources.getString("message"));
        }else {
            btn.setText("Hello Default!");
        }
    }
}
