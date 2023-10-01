import java.awt.*;
import javax.swing.*;

public class TracNghiemGUI extends JFrame {
   private JLabel label;
   private JRadioButton radioButton1, radioButton2, radioButton3, radioButton4;
   private JButton submitButton;

   public TracNghiemGUI() {
      // Thiết lập tiêu đề của cửa sổ
      setTitle("Đề thi trắc nghiệm");

      // Tạo label cho câu hỏi
      label = new JLabel("Câu hỏi: 1 + 1 = ?");
      label.setFont(new Font("Serif", Font.PLAIN, 16));

      // Tạo các nút radio button cho câu trả lời
      radioButton1 = new JRadioButton("a) 2");
      radioButton2 = new JRadioButton("b) 3");
      radioButton3 = new JRadioButton("c) 4");
      radioButton4 = new JRadioButton("d) 5");

      // Tạo group cho các radio button để chỉ cho phép chọn một phương án
      ButtonGroup group = new ButtonGroup();
      group.add(radioButton1);
      group.add(radioButton2);
      group.add(radioButton3);
      group.add(radioButton4);

      // Tạo nút submit
      submitButton = new JButton("Submit");

      // Thiết lập layout và thêm các thành phần vào frame
      setLayout(new GridLayout(5, 1));
      add(label);
      add(radioButton1);
      add(radioButton2);
      add(radioButton3);
      add(radioButton4);
      add(submitButton);

      // Thiết lập kích thước và hiển thị cửa sổ
      setSize(400, 200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
   }
}