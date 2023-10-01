import java.awt.*;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.*;

public class QuizView extends JFrame {
    private JLabel questionLabel;
    private JCheckBox answer1Button;
    private JCheckBox answer2Button;
    private JCheckBox answer3Button;
    private JCheckBox answer4Button;
    private JButton submitButton;
    private ButtonGroup answerGroup;
    
    public QuizView() {
        this.setTitle("Trắc nghiệm");
        this.setSize(900, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(7, 1));
        
        // Question 1
        questionLabel = new JLabel("1. Câu hỏi 1?");
        this.add(questionLabel);
        answerGroup = new ButtonGroup();
        answer1Button = new JCheckBox("Phương án 1");
        answer2Button = new JCheckBox("Phương án 2");
        answer3Button = new JCheckBox("Phương án 3");
        answer4Button = new JCheckBox("Phương án 4");
        answerGroup.add(answer1Button);
        answerGroup.add(answer2Button);
        answerGroup.add(answer3Button);
        answerGroup.add(answer4Button);
        JPanel answerPanel1 = new JPanel(new GridLayout(1, 4));
        answerPanel1.add(answer1Button);
        answerPanel1.add(answer2Button);
        answerPanel1.add(answer3Button);
        answerPanel1.add(answer4Button);
        this.add(answerPanel1);
        
        // Question 2
        questionLabel = new JLabel("2. Câu hỏi 2?");
        this.add(questionLabel);
        answerGroup = new ButtonGroup();
        answer1Button = new JCheckBox("Phương án 1");
        answer2Button = new JCheckBox("Phương án 2");
        answer3Button = new JCheckBox("Phương án 3");
        answer4Button = new JCheckBox("Phương án 4");
        answerGroup.add(answer1Button);
        answerGroup.add(answer2Button);
        answerGroup.add(answer3Button);
        answerGroup.add(answer4Button);
        JPanel answerPanel2 = new JPanel(new GridLayout(1, 4));
        answerPanel2.add(answer1Button);
        answerPanel2.add(answer2Button);
        answerPanel2.add(answer3Button);
        answerPanel2.add(answer4Button);
        this.add(answerPanel2);

        //q3
        questionLabel = new JLabel("3. Câu hỏi 3?");
        this.add(questionLabel);
        answerGroup = new ButtonGroup();
        answer1Button = new JCheckBox("Phương án 1");
        answer2Button = new JCheckBox("Phương án 2");
        answer3Button = new JCheckBox("Phương án 3");
        answer4Button = new JCheckBox("Phương án 4");
        answerGroup.add(answer1Button);
        answerGroup.add(answer2Button);
        answerGroup.add(answer3Button);
        answerGroup.add(answer4Button);
        JPanel answerPanel3 = new JPanel(new GridLayout(1, 4));
        answerPanel3.add(answer1Button);
        answerPanel3.add(answer2Button);
        answerPanel3.add(answer3Button);
        answerPanel3.add(answer4Button);
        this.add(answerPanel3);
        //q4
        questionLabel = new JLabel("4. Câu hỏi 4?");
        this.add(questionLabel);
        answerGroup = new ButtonGroup();
        answer1Button = new JCheckBox("Phương án 1");
        answer2Button = new JCheckBox("Phương án 2");
        answer3Button = new JCheckBox("Phương án 3");
        answer4Button = new JCheckBox("Phương án 4");
        answerGroup.add(answer1Button);
        answerGroup.add(answer2Button);
        answerGroup.add(answer3Button);
        answerGroup.add(answer4Button);
        JPanel answerPanel4 = new JPanel(new GridLayout(1, 4));
        answerPanel4.add(answer1Button);
        answerPanel4.add(answer2Button);
        answerPanel4.add(answer3Button);
        answerPanel4.add(answer4Button);
        this.add(answerPanel4);

        //
    

        this.setVisible(true);
    }
}
