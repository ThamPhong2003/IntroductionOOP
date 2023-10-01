package Test;

import controller.LoginListener;
import model.UserList;
import view.LoginView;

public class test {
    public static void main(String[] args) {
        LoginView view = new LoginView();
        LoginListener controller = new LoginListener(view, new UserList());
        view.setVisible(true);
    }
}
