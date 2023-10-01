package view;
import java.awt.*;
import java.awt.event.*;

import javax.security.auth.login.AccountLockedException;
import javax.swing.*;
import controller.ClientControl;
import controller.ServerControl;
import Model.ServerModel;
import Model.User;
public class ClientView extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    public ClientView() {
        this.init();
    }

    public void init() {
        // Khởi tạo giao diện
        this.setTitle("Đăng nhập");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Tạo các component
        JLabel usernameLabel = new JLabel("Tên đăng nhập:");
        JLabel passwordLabel = new JLabel("Mật khẩu:");
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20); 
        JButton loginButton = new JButton("Đăng nhập");

        // Xử lý sự kiện khi click đăng nhập
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Đóng gói thông tin đăng nhập vào đối tượng User
                User user = new User(usernameField.getText(), new String(passwordField.getPassword()));
        
                // Chuyển đối tượng User xuống lớp ClientControl
                ClientControl clientControl = new ClientControl();
                boolean loginSuccess = clientControl.processLogin(user);
        
                // Hiển thị kết quả đăng nhập trên LoginView
                showResult(loginSuccess);
            }
        });
        

        // Thêm các component vào giao diện
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel());
        panel.add(loginButton);

        this.add(panel);
        this.pack();
        this.setVisible(true);
    }

    // Hiển thị kết quả đăng nhập trên LoginView
    public void showResult(boolean success) {
        LoginView loginView = new LoginView();
        loginView.showMessage(success);
    }
}
