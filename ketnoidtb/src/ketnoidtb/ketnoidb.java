package ketnoidtb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;
public class ketnoidb {
    public static void main(String[] args) throws ClassNotFoundException {
        String server = "THAMPHONG2K3";
        String database = "test";
        String username = "sa";
        String password = "phong2003";

        String connectionUrl = "jdbc:sqlserver://" + server + ";databaseName=" + database;
       
        try (Connection connection = DriverManager.getConnection(connectionUrl, username, password)) {
            System.out.println("Kết nối thành công đến cơ sở dữ liệu: " + connection.getCatalog());
        } catch (SQLException e) {
            System.out.println("Kết nối không thành công. Lỗi: " + e.getMessage());
        }
    }
}
