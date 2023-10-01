package view;
import javax.swing.*;

import controller.LoginController;

import java.awt.*;
import java.awt.event.*;

public class LoginView extends JFrame implements ActionListener {
    private JTextField phonenumberField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel statusLabel;
    private LoginController controller;

    public LoginView(LoginController controller) {
        this.controller = controller;
        init();
    }

    private void init() {
        // Set up the login interface
        this.setSize(300, 200);
        this.setTitle("Login");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(3, 2, 10, 10));
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel phonenumberLabel = new JLabel("Phone number:");
        contentPane.add(phonenumberLabel);

        phonenumberField = new JTextField();
        contentPane.add(phonenumberField);

        JLabel passwordLabel = new JLabel("Password:");
        contentPane.add(passwordLabel);

        passwordField = new JPasswordField();
        contentPane.add(passwordField);

        JLabel emptyLabel = new JLabel("");
        contentPane.add(emptyLabel);

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        contentPane.add(loginButton);

        statusLabel = new JLabel("");
        contentPane.add(statusLabel);

        this.setContentPane(contentPane);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String phoneNumber = phonenumberField.getText();
            String password = new String(passwordField.getPassword());
            controller.login(phoneNumber, password);
        }
    }

    public void setStatus(String message) {
        statusLabel.setText(message);
    }
}
