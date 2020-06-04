package class06_03.ex2;

import class05_12.ex3.Bulletin;
import class05_12.ex3.Writing;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SimpleDbBulletin implements Bulletin {

    @Override
    public void write(Writing writing) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost/study",
                    "root", "9946");

            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO bulletin ");
            sql.append("(id, title, content, writer) ");
            sql.append("VALUES (?, ?, ?, ?) ");

            PreparedStatement pstmt = con.prepareStatement(sql.toString());
            pstmt.setString(1, String.valueOf(writing.getIndex()));
            pstmt.setString(2, writing.getTitle());
            pstmt.setString(3, writing.getContent());
            pstmt.setString(4, writing.getWriter());

            pstmt.executeQuery();

            pstmt.close();
            con.close();

        } catch (Exception e){ e.printStackTrace(); }
    }

    @Override
    public Writing read(int index) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost/study",
                    "root", "9946");

            StringBuilder sql = new StringBuilder();
            sql.append("SELECT ");
            sql.append("id, ");
            sql.append("title, ");
            sql.append("content, ");
            sql.append("writer ");
            sql.append("FROM bulletin ");
            sql.append("WHERE id LIKE ?");

            PreparedStatement pstmt = con.prepareStatement(sql.toString());
            pstmt.setString(1, String.valueOf(index));

            ResultSet rs = pstmt.executeQuery();
            Writing writing = new Writing();

            rs.next();

            writing.setIndex(rs.getInt("id"));
            writing.setTitle(rs.getString("title"));
            writing.setContent(rs.getString("content"));
            writing.setWriter(rs.getString("writer"));

            rs.close();
            pstmt.close();
            con.close();

            return writing;
        } catch (Exception e) { e.printStackTrace(); }
        return null;
    }

    @Override
    public List<Writing> list() {

        List<Writing> list = new ArrayList<>();

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost/study",
                    "root", "9946");

            StringBuilder sql = new StringBuilder();
            sql.append("SELECT ");
            sql.append("id, ");
            sql.append("title, ");
            sql.append("content, ");
            sql.append("writer ");
            sql.append("FROM bulletin ");
            sql.append("ORDER BY id DESC ");

            PreparedStatement pstmt = con.prepareStatement(sql.toString());
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String content = rs.getString("content");
                String writer = rs.getString("writer");

                Writing writing = new Writing();
                writing.setIndex(id);
                writing.setTitle(title);
                writing.setContent(content);
                writing.setWriter(writer);

                list.add(writing);
            }

            rs.close();
            pstmt.close();
            con.close();
        }
        catch (Exception e) { e.printStackTrace(); }
        return list;
    }
}
