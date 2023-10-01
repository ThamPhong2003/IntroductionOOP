package com.example.demo3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent fxmlLoader =  FXMLLoader.load(getClass().getResource("scene2.fxml"));
        Scene scene = new Scene(fxmlLoader);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {

        launch();
    }
}