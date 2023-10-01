package Model;
import java.util.HashMap;
import java.util.Map;

public class UserModel {
    private Map<String, String> users;

    public UserModel() {
        users = new HashMap<>();
        users.put("0912345678", "password1");
        users.put("0323456789", "password2");
        users.put("0987654321", "password3");
    }

    public boolean isValidUser(String phoneNumber, String password) {
        if (users.containsKey(phoneNumber)) {
            return users.get(phoneNumber).equals(password);
        }
        return false;
    }

}
