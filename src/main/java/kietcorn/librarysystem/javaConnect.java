package kietcorn.librarysystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class javaConnect {
    public static Connection connectDB() {
        Connection conn = null;
        try {
            // Đường dẫn tới file SQLite DB (nếu chưa có sẽ tự tạo)
            String url = "jdbc:sqlite:D:/A_UET/Sem6/OOP/LibrarySystem/library.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Kết nối SQLite thành công!");
        } catch (SQLException e) {
            System.out.println("Lỗi kết nối SQLite: " + e.getMessage());
        }
        return conn;
    }
   
}
