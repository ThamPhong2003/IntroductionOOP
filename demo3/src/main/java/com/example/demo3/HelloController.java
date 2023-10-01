package com.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;


public class HelloController {
    //@FXML
    //private Label welcomeText;


    //@FXML
    //protected void onHelloButtonClick() {
    //    welcomeText.setText("Welcome to JavaFX Application!");
    //}

    public Stage stage;
    private Scene scene;
    private Parent root;


    public void start(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
        stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        // Tùy chọn, bạn có thể đóng cửa sổ hiện tại nếu cần
        ((Node) event.getSource()).getScene().getWindow().hide();
    }

    public void switchToScene2(ActionEvent actionEvent) {
    }
}
