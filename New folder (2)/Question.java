import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Question {
    String question;
    String answerA;
    String answerB;
    String answerC;
    String answerD;
    String correctAnswer;

    public Question(String question, String answerA, String answerB, String answerC, String answerD, String correctAnswer) {
        this.question = question;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.correctAnswer = correctAnswer;
    }

    public String toString() {
        return question + "|" + answerA + "|" + answerB + "|" + answerC + "|" + answerD + "|" + correctAnswer;
    }
}



   