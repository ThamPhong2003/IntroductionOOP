package test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class QuestionApp extends JFrame {
    private List<Question> questions;
    private JTextArea questionArea;
    private JTextField answerField;
    private JButton addButton;
    private JButton displayButton;

    public QuestionApp() {
        // Khởi tạo danh sách câu hỏi
        questions = new ArrayList<>();

        // Thiết lập các thuộc tính của cửa sổ
        setTitle("Ứng dụng câu hỏi");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Tạo và định vị các thành phần giao diện
        questionArea = new JTextArea(5, 30);
        add(new JScrollPane(questionArea));

        answerField = new JTextField(20);
        add(answerField);

        addButton = new JButton("Thêm câu hỏi");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String questionText = questionArea.getText();
                String answer = answerField.getText();

                Question question = new Question(questionText, answer);
                questions.add(question);

                questionArea.setText("");
                answerField.setText("");
            }
        });
        add(addButton);

        displayButton = new JButton("Hiển thị câu hỏi");
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                for (Question question : questions) {
                    sb.append("Câu hỏi: ").append(question.getQuestionText()).append("\n");
                    sb.append("Đáp án: ").append(question.getAnswer()).append("\n");
                    sb.append("--------------------\n");
                }
                JOptionPane.showMessageDialog(null, sb.toString(), "Danh sách câu hỏi", JOptionPane.PLAIN_MESSAGE);
            }
        });
        add(displayButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            QuestionApp app = new QuestionApp();
            app.setVisible(true);
        });
    }
}

class Question {
    private String questionText;
    private String answer;

    public Question(String questionText, String answer) {
        this.questionText = questionText;
        this.answer = answer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getAnswer() {
        return answer;
    }
}
