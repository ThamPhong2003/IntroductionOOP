package view;

import javax.swing.*;
import controller.LoginListener;
import model.LoginModel;
import model.UserList;
import java.awt.*;
import java.awt.event.*;

public class LoginView extends JFrame {
    private JTextField phonenumberField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginView() {
        this.init();
    }

    public void init() {
        // Thiết lập giao diện đăng nhập
        this.setSize(300, 150);
        this.setTitle("Đăng nhập");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(3, 2, 10, 10));
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel phonenumberLabel = new JLabel("Số điện thoại:");
        contentPane.add(phonenumberLabel);

        phonenumberField = new JTextField();
        contentPane.add(phonenumberField);

        JLabel passwordLabel = new JLabel("Mật khẩu:");
        contentPane.add(passwordLabel);

        passwordField = new JPasswordField();
        contentPane.add(passwordField);

        JLabel emptyLabel = new JLabel("");
        contentPane.add(emptyLabel);
        LoginListener loginController = new LoginListener(this, new UserList());
        loginButton = new JButton("Đăng nhập");
        contentPane.add(loginButton);
        loginButton.addActionListener(loginController);

        this.setContentPane(contentPane);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public String getPhoneNumber() {
        return phonenumberField.getText();
    }

    public String getPassword() {
        return new String(passwordField.getPassword());
    }

    // Thêm phương thức getUser() trả về một đối tượng LoginModel
    public LoginModel getUser() {
        String phonenumber = getPhoneNumber();
        String password = getPassword();
        return new LoginModel(phonenumber, password);
    }

    public void addLoginListener(ActionListener listener) {
        loginButton.addActionListener(listener);
    }

    public void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Lỗi", JOptionPane.ERROR_MESSAGE);
    }

    public void showSuccessMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Thành công", JOptionPane.INFORMATION_MESSAGE);
    }
}
