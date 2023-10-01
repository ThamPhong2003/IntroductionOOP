import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    private VBox contentBox; // Chứa nội dung

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX - Hiển thị phần tiếp theo");

        // Tạo nút để bấm và hiển thị phần tiếp theo
        Button nextButton = new Button("Hiển thị phần tiếp theo");
        nextButton.setOnAction(e -> showNextContent());

        // Tạo VBox để chứa nút và nội dung
        VBox root = new VBox(10);
        root.getChildren().addAll(nextButton);

        // Tạo ScrollPane để cho phần tiếp theo có thể lướt xuống
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);
        scrollPane.setContent(root);

        // Tạo Scene và hiển thị
        Scene scene = new Scene(scrollPane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showNextContent() {
        // Tạo phần tiếp theo (ở đây là một Label)
        Label nextContent = new Label("Đây là phần tiếp theo");

        // Thêm phần tiếp theo vào VBox chứa nội dung
        contentBox.getChildren().add(nextContent);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
