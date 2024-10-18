package connect_database;

import java.sql.*;
import javax.swing.JOptionPane;

public class MySQLConnect {
   public static Connection connectDB() {
        String host = "jdbc:mysql://localhost:3306/bscp6b?useSSL=true&useUnicode=yes&characterEncoding=UTF-8";
        String username = "root";
        String password = "";
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(host, username, password);
            //JOptionPane.showMessageDialog(null, "ເຊື່ອມຕໍ່ສໍາເລັດ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return conn;
    }

    //ທົດສອບການເຊື່ອມຕໍ່ຖານຂໍ້ມູນ
    public static void main(String[] args) {
        connectDB();
    }
}
