package view;

import javax.swing.*;

import model.Question;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizView extends JFrame {
    private List<Question> questionList;
    private int currentQuestionIndex;
    private JLabel questionLabel;
    private JRadioButton optionARadioButton;
    private JRadioButton optionBRadioButton;
    private JRadioButton optionCRadioButton;
    private JRadioButton optionDRadioButton;
    private JButton nextButton;
    private int score;
public QuizView(String string) {
    }
public  QuizView (){
    this.init ();
}
    private void init() {
            questionList = new ArrayList<>();
            currentQuestionIndex = 0;
            score = 0;   
            this.setSize ( 500,500);     // Initialize the quiz view
            this.setTitle("Thi Trắc Nghiệm");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
            // Create the components
            questionLabel = new JLabel();
            optionARadioButton = new JRadioButton();
            optionBRadioButton = new JRadioButton();
            optionCRadioButton = new JRadioButton();
            optionDRadioButton = new JRadioButton();
            nextButton = new JButton("Tiếp tục");
    
            // Create a button group for the radio buttons
            ButtonGroup buttonGroup = new ButtonGroup();
            buttonGroup.add(optionARadioButton);
            buttonGroup.add(optionBRadioButton);
            buttonGroup.add(optionCRadioButton);
            buttonGroup.add(optionDRadioButton);
    
            // Set up the layout
            JPanel panel = new JPanel(new GridBagLayout());
            GridBagConstraints c = new GridBagConstraints();
            c.gridx = 0;
            c.gridy = 0;
            c.anchor = GridBagConstraints.LINE_START;
            c.insets = new Insets(5, 5, 5, 5);
            panel.add(questionLabel, c);
    
            c.gridy = 1;
            panel.add(optionARadioButton, c);
    
            c.gridy = 2;
            panel.add(optionBRadioButton, c);
    
            c.gridy = 3;
            panel.add(optionCRadioButton, c);
    
            c.gridy = 4;
            panel.add(optionDRadioButton, c);
    
            c.gridy = 5;
            panel.add(nextButton, c);
    
            this.add(panel);
            this.pack();
            this.setVisible(true);
    
            // Load the questions from file
            loadQuestionsFromFile("questions.txt");
    
            // Start the quiz
            startQuiz();
            this.setVisible(true);
        }
    
        private void loadQuestionsFromFile(String filePath) {
            try {
                File file = new File(filePath);
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] parts = line.split(",");
                    if (parts.length == 6) {
                        String question = parts[0];
                        String optionA = parts[1];
                        String optionB = parts[2];
                        String optionC = parts[3];
                        String optionD = parts[4];
                        String correctAnswer = parts[5];
                        Question newQuestion = new Question(question, optionA, optionB, optionC, optionD, correctAnswer);
                        questionList.add(newQuestion);
                    }
                }
                scanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    
        private void startQuiz() {
            showQuestion();
            nextButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    checkAnswer();
                    currentQuestionIndex++;
                    if (currentQuestionIndex < questionList.size()) {
                        showQuestion();
                    } else {
                        endQuiz();
                    }
                }
    
                private void endQuiz() {
                }
            });
        }
    
        private void showQuestion() {
            Question currentQuestion = questionList.get(currentQuestionIndex);
            questionLabel.setText(currentQuestion.getQuestion());
            optionARadioButton.setText("A. " + currentQuestion.getOptionA());
            optionBRadioButton.setText("B. " + currentQuestion.getOptionB());
            optionCRadioButton.setText("C. " + currentQuestion.getOptionC());
            optionDRadioButton.setText("D. " + currentQuestion.getOptionD());
        }
    
        private void checkAnswer() {
            Question currentQuestion = questionList.get(currentQuestionIndex);
            String selectedAnswer = "";
            if (optionARadioButton.isSelected()) {
                selectedAnswer = "A";
            } else if (optionBRadioButton.isSelected()) {
                selectedAnswer = "B";
            } else if (optionCRadioButton.isSelected()) {
                selectedAnswer = "C";
            } else if (optionDRadioButton.isSelected()) {
                selectedAnswer = "D";
            }
                // Kiểm tra đáp án
                if (selectedAnswer.equals(currentQuestion.getCorrectAnswer())) {
                    // Đáp án đúng, tăng điểm số
                    score++;
                }
        
                // Kiểm tra xem đã hoàn thành tất cả câu hỏi chưa
                if (currentQuestionIndex == questionList.size() - 1) {
                    // Đã hoàn thành tất cả câu hỏi, kết thúc thi
                    endQuiz();
                } else {
                    // Chưa hoàn thành tất cả câu hỏi, chuyển sang câu hỏi tiếp theo
                    currentQuestionIndex++;
                    showQuestion();
                }
            }
    
        private void endQuiz() {
        }
    
 }
        
    