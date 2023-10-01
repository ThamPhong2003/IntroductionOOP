package controller;

import Model.UserModel;
import view.LoginView;
public class LoginController {
    private UserModel userModel;
    private LoginView loginView;

    public LoginController(UserModel userModel, LoginView loginView) {
        this.userModel = userModel;
        this.loginView = loginView;
    }

    public void login(String phoneNumber, String password) {
        boolean isValidUser = userModel.isValidUser(phoneNumber, password);
        if (isValidUser) {
            loginView.setStatus("Login successful");
        } else {
            loginView.setStatus("Invalid phone number or password");
        }
    }
}
