package main;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.testfx.framework.junit5.ApplicationTest;

public class MainTest extends ApplicationTest {

    // Headless testing
    @BeforeAll
    static void setUp() {
        if (Boolean.getBoolean("headless")) {
            System.setProperty("testfx.robot", "glass");
            System.setProperty("testfx.headless", "true");
            System.setProperty("prism.order", "sw");
            System.setProperty("prism.text", "t2k");
            System.setProperty("java.awt.headless", "true");
        }
    }

    public void start(Stage stage) throws Exception {
        Parent rootNode = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(rootNode);
        stage.setTitle("Hello JavaFX and Maven Test");
        stage.setScene(scene);
        stage.show();
    }


    @Test
    void labelTextTest() {
        interact(()->{
            JFXButton btn  = lookup("#btn").query();
            assertEquals(btn.getText(), "Hello Default!");
        });
    }

}
