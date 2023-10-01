package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

import javax.swing.JOptionPane;

import Model.ServerModel;
import Model.User;
import view.LoginView;
import sever.ServerView;

public class ServerControl implements Runnable {

    private ServerView view;
    private ServerSocket serverSocket;
    private int port;
    private User accountList;
    private LoginView loginView;

    public ServerControl(ServerView view, int port, User accountList) {
        this.view = view;
        this.port = port;
        this.accountList = accountList;
    }
    
    @Override
    public void run() {
        try {
            // Khởi tạo socket máy chủ trên cổng được chỉ định
            serverSocket = new ServerSocket(port);
            view.showMessage("Server started on port " + port);
            
            while (true) {
                // Chấp nhận kết nối từ client
                Socket clientSocket = serverSocket.accept();
                view.showMessage("Client connected: " + clientSocket.getInetAddress());
                
                // Đọc thông tin đăng nhập từ client
                ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
                User user = (User) ois.readObject();
                
                // Kiểm tra thông tin đăng nhập
                boolean loginSuccess = checkLogin(user);

                // Gửi kết quả kiểm tra đăng nhập cho client
                ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());
                oos.writeBoolean(loginSuccess);
                oos.flush();
                
                // Đóng kết nối
                ois.close();
                oos.close();
                clientSocket.close();
            }
        } catch (IOException e) {
            view.showMessage("Error starting server: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            view.showMessage("Error reading user object: " + e.getMessage());
        }
    }
    
    private boolean checkLogin(User user) {
        List<ServerModel> accountList = this.accountList.getAccountList();
        for (ServerModel account : accountList) {
            if (account.getUsername().equals(user.getUsername()) && account.getPassword().equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }
    
}
