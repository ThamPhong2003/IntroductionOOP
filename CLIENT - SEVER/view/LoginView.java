package view;
import javax.swing.*;

public class LoginView {
    public void showMessage(boolean success) {
        if (success) {
            JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
        } else {
            JOptionPane.showMessageDialog(null, "Đăng nhập thất bại");
        }
    }

    public String getUsername() {
        return null;
    }

    public String getPassword() {
        return null;
    }
}

