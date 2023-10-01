package model;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    private List<LoginModel> accountList;

    public UserList() {
        accountList = new ArrayList<>();
        accountList.add(new LoginModel("0987654321", "q2w2e3"));
        accountList.add(new LoginModel("0983313567", "ki98u7"));
        accountList.add(new LoginModel("0912345678", "ngaythu5"));
        accountList.add(new LoginModel("0987452100", "so1daicovi"));
        accountList.add(new LoginModel("0384857059", "phong123"));

    }

    public boolean checkLogin(String phonenumber, String password) {
        for (LoginModel account : accountList) {
            if (account.getPhoneNumber().equals(phonenumber) && account.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public List<LoginModel> getAccountList() {
        return accountList;
    }
}
