package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

import model.LoginModel;
import model.UserList;
import view.LoginView;

public class LoginListener implements ActionListener {

    private static final String Login = null;
    private LoginView login;
    private UserList accountlist;
    private String phonenumber;

    public LoginListener(LoginView login, UserList accountList) {
        this.login = login;
        this.accountlist = accountList;
    }   

    public void actionPerformed(ActionEvent e) {
        String phoneNumberInput = login.getPhoneNumber();
        String passwordInput = login.getPassword();
    
        if (!isValidPhonenumber(phoneNumberInput) || !isValidPassword(passwordInput)) {
            JOptionPane.showMessageDialog(login, "Số điện thoại hoặc mật khẩu không hợp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            List<LoginModel> accountList = accountlist.getAccountList();
            boolean isSuccessful = accountlist.checkLogin(phoneNumberInput, passwordInput);
            if (isSuccessful) {
                JOptionPane.showMessageDialog(login, "Đăng nhập thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(login, "Đăng nhập thất bại", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    

    private boolean isValidPhonenumber(String phonenumber) {
        // Số điện thoại có định dạng 09xxxxxxxx hoặc 03xxxxxxxx và đủ 10 chữ số
        return phonenumber.matches("(09|03)\\d{8}") && phonenumber.length() == 10;
    }

    private boolean isValidPassword(String password) {
        // Mật khẩu có độ dài từ 6 đến 10 ký tự, bao gồm chữ cái và số, không có ký tự đặc biệt
        return password.matches("[a-zA-Z0-9]{6,10}");
    }
}
