package Model;
import java.io.Serializable;

public class ServerModel implements Serializable {
    private String username;
    private String password;

    public ServerModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
}