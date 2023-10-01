package Model;


import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

public class User {
    private List<ServerModel> accountList;

    public User() {
        accountList = new ArrayList<>();
        accountList.add(new ServerModel("0987654321", "q2w2e3"));
        accountList.add(new ServerModel("0983313567", "ki98u7"));
        accountList.add(new ServerModel("0912345678", "ngaythu5"));
        accountList.add(new ServerModel("0987452100", "so1daicovi"));
        accountList.add(new ServerModel("0384857059", "phong123"));

    }

    public User(String text, String string) {
    }

    public boolean checkLogin(String Username, String password) {
        for (ServerModel account : accountList) {
            if (account.getUsername().equals(Username) && account.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public List<ServerModel> getAccountList() {
        return accountList;
    }

    public Object getUsername() {
        return null;
    }

    public Object getPassword() {
        return null;
    }

}
