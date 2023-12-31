package com.example.project.gui61;



import com.example.project.database.dao.QuizDao;
import com.example.project.database.entities.Quiz;
import com.example.project.popup.popup;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;


import java.net.URL;
import java.util.ResourceBundle;

public class gui61 implements Initializable {
    @FXML
    private Button quizname;

    @FXML
    private Label tenquiz;

    @FXML
    private Label timelimit1;


    @FXML
    void caidat(ActionEvent event) {
        try {
            Stage ag0r1 = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/project/gui62/gui(6.2).fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            ag0r1.setScene(scene);
            ag0r1.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @FXML
    void previewquiznow(ActionEvent event) {
        try {
            Stage a = (Stage) timelimit1.getScene().getWindow();
            FXMLLoader loader= new FXMLLoader(getClass().getResource("/com/example/project/gui61/dialog.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage ag0r1=new Stage();

            ag0r1.setScene(scene);
            ag0r1.initModality(Modality.APPLICATION_MODAL);
            ag0r1.initOwner(a);
            ag0r1.showAndWait();
            dialog controller = loader.getController();
           if(controller.getB()==1) a.hide();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @FXML
    void home(ActionEvent event) {
        try {
            Stage ag0r1 = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/project/gui11/gui(1.1).fxml"));
            Scene scene = new Scene(root);
            ag0r1.setScene(scene);
            ag0r1.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Text text = new Text();
        tenquiz.setGraphic(text);
        quizname.setText(QuizDao.getInstance().getQuiz().getQuizName());
text.setText(QuizDao.getInstance().getQuiz().getQuizName());
        timelimit1.setText(QuizDao.getInstance().getQuiz().getTimeLimit()+" minutes");
    }
}

