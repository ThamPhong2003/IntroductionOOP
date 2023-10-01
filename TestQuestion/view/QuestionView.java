package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import model.Question;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class QuestionView extends JFrame {
    private JTextArea questionTextArea;
    private JTextField optionATextField;
    private JTextField optionBTextField;
    private JTextField optionCTextField;
    private JTextField optionDTextField;
    private JTextField optionAnwser ;
    private JButton saveButton;
    private JList<Question> questionList;
    private DefaultListModel<Question> listModel;
    private File file;
    
    public QuestionView() {
        this.init();
    }
    
    /**
     * 
     */
    public void init() {
        // Khởi tạo giao diện
        this.setTitle("Quản lý câu hỏi");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Tạo các component
        JLabel questionLabel = new JLabel("Câu hỏi:");
        JLabel optionALabel = new JLabel("A:");
        JLabel optionBLabel = new JLabel("B:");
        JLabel optionCLabel = new JLabel("C:");
        JLabel optionDLabel = new JLabel("D:");
        JLabel optionAnswerLabel = new JLabel("Anws");
        questionTextArea = new JTextArea(5, 20);
        JScrollPane questionScrollPane = new JScrollPane(questionTextArea);
        
        optionATextField = new JTextField(20);
        optionBTextField = new JTextField(20);
        optionCTextField = new JTextField(20);
        optionDTextField = new JTextField(20);
        optionAnwser = new JTextField(20);
        
        saveButton = new JButton("Lưu");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveQuestion();
            }
        });
        
        listModel = new DefaultListModel<>();
        questionList = new JList<>(listModel);
        
        // Thêm các component vào giao diện
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.LINE_START;
        panel.add(questionLabel, c);
        
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        panel.add(questionScrollPane, c);
        
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.NONE;
        panel.add(optionALabel, c);
        
        c.gridx = 1;
        c.gridy = 1;
        panel.add(optionATextField, c);
        
        c.gridx = 0;
        c.gridy = 2;
        panel.add(optionBLabel, c);
        
        c.gridx = 1;
        c.gridy = 2;
        panel.add(optionBTextField, c);

        c.gridx = 0;
        c.gridy = 3;
        panel.add(optionCLabel, c);

        c.gridx = 1;
        c.gridy = 3;
        panel.add(optionCTextField, c);

        c.gridx = 0;
        c.gridy = 4;
        panel.add(optionDLabel, c);

        c.gridx = 1;
        c.gridy = 4;
        panel.add(optionDTextField, c);

        c.gridx = 1;
        c.gridy = 6;
        panel.add(saveButton, c);

        c.gridx = 0;
        c.gridy = 5;
        panel.add(optionAnswerLabel,c);
        c.gridx = 1;
        c.gridy = 5;
        panel.add(optionAnwser);


        c.gridx = 2;
        c.gridy = 0;
        c.gridheight = 7;
        c.fill = GridBagConstraints.BOTH;
        panel.add(new JScrollPane(questionList), c);

        this.add(panel);
        this.pack();        this.setVisible(true);
    }

    public void saveQuestion() {
        String question = questionTextArea.getText();
        String optionA = optionATextField.getText();
        String optionB = optionBTextField.getText();
        String optionC = optionCTextField.getText();
        String optionD = optionDTextField.getText();
        String answer = optionAnwser.getText();

        if (!question.isEmpty() && !optionA.isEmpty() && !optionB.isEmpty() && !optionC.isEmpty() && !optionD.isEmpty()) {
            Question newQuestion = new Question(question, optionA, optionB, optionC, optionD, optionD);
            listModel.addElement(newQuestion);
            clearFields();
            saveToFile(newQuestion);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin câu hỏi và đáp án.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields() {
        questionTextArea.setText("");
        optionATextField.setText("");
        optionBTextField.setText("");
        optionCTextField.setText("");
        optionDTextField.setText("");
    }

    private void saveToFile(Question question) {
        String fileName = "questions.txt";
        String filePath = "D:\\PR\\OOP\\TestQuestion\\" + fileName;
        
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            PrintWriter writer = new PrintWriter(fileWriter);
            writer.println(question.getQuestion() + "," +
                    question.getOptionA() + "," +
                    question.getOptionB() + "," +
                    question.getOptionC() + "," +
                    question.getOptionD() + "," +
                    question.getCorrectAnswer());
            writer.close();
            fileWriter.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi lưu câu hỏi vào file.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new QuestionView();
            }
        });
    }
}

