package class06_03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcTest2 {
    public static void main(String[] args) {
        try{

            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("OK");

            Connection con = DriverManager.getConnection(
                    "jdbc:mariadb://10.80.161.224/dgsw",
                    "root", "dgswjava");

            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO user ");
            sql.append("    (user_id, user_name, phone_number, password) ");
            sql.append("VALUES ");
            sql.append("    (?, ?, ?, ?) ");

            PreparedStatement pstmt = con.prepareStatement(sql.toString());
            pstmt.setString(1, "kjy031104");
            pstmt.setString(2, "김주엽");
            pstmt.setString(3, "010-63927114");
            pstmt.setString(4, "kjy25400");

            pstmt.executeUpdate();
            con.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
