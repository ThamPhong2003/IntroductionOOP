import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Question> questionList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Thêm câu hỏi ===");
        boolean addMoreQuestions = true;
        while (addMoreQuestions) {
            System.out.println("Nhập câu hỏi:");
            String question = scanner.nextLine();

            System.out.println("Nhập đáp án A:");
            String answerA = scanner.nextLine();

            System.out.println("Nhập đáp án B:");
            String answerB = scanner.nextLine();

            System.out.println("Nhập đáp án C:");
            String answerC = scanner.nextLine();

            System.out.println("Nhập đáp án D:");
            String answerD = scanner.nextLine();

            System.out.println("Nhập đáp án chính xác (A, B, C, hoặc D):");
            String correctAnswer = scanner.nextLine();

            Question newQuestion = new Question(question, answerA, answerB, answerC, answerD, correctAnswer);
            questionList.add(newQuestion);

            System.out.println("Thêm câu hỏi khác? (Y/N)");
            String choice = scanner.nextLine();
            addMoreQuestions = choice.equalsIgnoreCase("Y");
        }

        // Lưu trữ câu hỏi vào tệp tin
        saveQuestionsToFile(questionList, "questions.txt");

        System.out.println("Câu hỏi đã được lưu trữ thành công.");
    }
    public static void saveQuestionsToFile(List<Question> questionList, String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);
            for (Question question : questionList) {
                writer.write(question.toString() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Lỗi khi lưu trữ câu hỏi vào tệp tin.");
            e.printStackTrace();
        }
    }
}
