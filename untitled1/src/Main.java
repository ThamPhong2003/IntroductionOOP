package src;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    public void start(Stage primaryStage) {
        primaryStage.setTitle("Basic JavaFX App");

        // Tạo một nút
        Button button = new Button();
        button.setText("Click me!");

        // Xử lý sự kiện khi nút được nhấn
        button.setOnAction(event -> {
            System.out.println("Button clicked!");
        });

        // Tạo một StackPane để chứa nút
        StackPane root = new StackPane();
        root.getChildren().add(button);

        // Tạo một Scene với kích thước cố định và gán nút vào Scene
        Scene scene = new Scene(root, 300, 200);

        // Gán Scene vào Stage
        primaryStage.setScene(scene);

        // Hiển thị Stage
        primaryStage.show();
    }
}
