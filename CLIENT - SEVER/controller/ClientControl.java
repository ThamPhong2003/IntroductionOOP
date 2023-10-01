package controller;

import java.io.*;
import java.net.*;
import view.ClientView;
import Model.ServerModel;
import Model.User;
public class ClientControl {
    private static final String SERVER_ADDRESS = "127.0.0.1";
    private static final int SERVER_PORT = 8080;

    public boolean processLogin(User user) {
        try {
            // Kết nối tới server
            Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
    
            // Gửi thông tin đăng nhập đến server
            OutputStream outputStream = socket.getOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(user);
    
            // Nhận kết quả từ server
            InputStream inputStream = socket.getInputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            boolean success = (boolean) objectInputStream.readObject();
    
            // Đóng kết nối
            objectOutputStream.close();
            objectInputStream.close();
            outputStream.close();
            inputStream.close();
            socket.close();
    
            return success;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
