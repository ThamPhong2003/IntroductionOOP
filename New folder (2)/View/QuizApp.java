package View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class QuizApp extends JFrame {
    private List<Question> questions;
    private JTextArea questionTextArea;
    private JTextField optionATextField;
    private JTextField optionBTextField;
    private JTextField optionCTextField;
    private JTextField optionDTextField;
    private JTextField correctAnswerTextField;

    public QuizApp() {
        questions = new ArrayList<>();

        setTitle("Ứng dụng Quiz");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Khung câu hỏi
        questionTextArea = new JTextArea(5, 40);
        add(new JScrollPane(questionTextArea));

        // Đáp án A
        JLabel optionALabel = new JLabel("Đáp án A:");
        add(optionALabel);
        optionATextField = new JTextField(20);
        add(optionATextField);

        // Đáp án B
        JLabel optionBLabel = new JLabel("Đáp án B:");
        add(optionBLabel);
        optionBTextField = new JTextField(20);
        add(optionBTextField);

        // Đáp án C
        JLabel optionCLabel = new JLabel("Đáp án C:");
        add(optionCLabel);
        optionCTextField = new JTextField(20);
        add(optionCTextField);

        // Đáp án D
        JLabel optionDLabel = new JLabel("Đáp án D:");
        add(optionDLabel);
        optionDTextField = new JTextField(20);
        add(optionDTextField);

        // Đáp án chính xác
        JLabel correctAnswerLabel = new JLabel("Đáp án chính xác (A, B, C, hoặc D):");
        add(correctAnswerLabel);
        correctAnswerTextField = new JTextField(5);
        add(correctAnswerTextField);

        // Nút thêm câu hỏi
        JButton addQuestionButton = new JButton("Thêm câu hỏi");
        addQuestionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String questionText = questionTextArea.getText();
                String optionA = optionATextField.getText();
                String optionB = optionBTextField.getText();
                String optionC = optionCTextField.getText();
                String optionD = optionDTextField.getText();
                String correctAnswer = correctAnswerTextField.getText();

                Question question = new Question(questionText, optionA, optionB, optionC, optionD, correctAnswer);
                questions.add(question);

                JOptionPane.showMessageDialog(null, "Câu hỏi đã được thêm vào danh sách.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

                // Xóa nội dung các trường
                questionTextArea.setText("");
                optionATextField.setText("");
                optionBTextField.setText("");
                optionCTextField.setText("");
                optionDTextField.setText("");
                correctAnswerTextField.setText("");
            }
        });
        add(addQuestionButton);

        // Nút làm bài
        JButton startQuizButton = new JButton("Làm bài");
        startQuizButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Đề thi:\n");

                // Hiển thị các câu hỏi đã thêm vào danh sách
                for (int i = 0; i < questions.size(); i++) {
                    Question question = questions.get(i);
                    sb.append("Câu hỏi ").append(i + 1).append(":\n");
                    sb.append("Câu hỏi: ").append(question.getQuestionText()).append("\n");
                    sb.append("Đáp án A: ").append(question.getOptionA()).append("\n");
                    sb.append("Đáp án B: ").append(question.getOptionB()).append("\n");
                    sb.append("Đáp án C: ").append(question.getOptionC()).append("\n");
                    sb.append("Đáp án D: ").append(question.getOptionD()).append("\n");
                    sb.append("Đáp án chính xác: ").append(question.getCorrectAnswer()).append("\n");
                    sb.append("\n");
                }

                // Hiển thị đề thi
                JOptionPane.showMessageDialog(null, sb.toString(), "Đề thi", JOptionPane.PLAIN_MESSAGE);
            }
        });
        add(startQuizButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new QuizApp();
            }
        });
    }
}

class Question {
    private String questionText;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String correctAnswer;

    public Question(String questionText, String optionA, String optionB, String optionC, String optionD, String correctAnswer) {
        this.questionText = questionText;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getOptionA() {
        return optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
