package example.class06_18;

import example.class06_24.BulletinModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SimpleDbBulletin {

    public void defaultDb(JdbcStrategy strategy) throws Exception{
        Connection con;
        PreparedStatement pstmt;

        Class.forName("org.mariadb.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mariadb://localhost/study", "root", "9946");

        pstmt = strategy.makePreparedStatement(con);
        pstmt.executeQuery();
    }

    public void register(RegisterModel model) throws Exception{
        defaultDb(new JdbcStrategy() {
            @Override
            public PreparedStatement makePreparedStatement(Connection con) throws SQLException {
                StringBuilder sql = new StringBuilder();
                sql.append("INSERT INTO member ");
                sql.append("(id, pw, name, gender, sms) ");
                sql.append("VALUES (?, ?, ?, ?, ?) ");

                PreparedStatement pstmt = con.prepareStatement(sql.toString());
                pstmt.setString(1, model.id);
                pstmt.setString(2, model.pw);
                pstmt.setString(3, model.name);
                pstmt.setString(4, model.gender);
                pstmt.setString(5, model.sms);

                return pstmt;
            }
        });
    }

    public List<BulletinModel> getAllList() throws Exception{
        List<BulletinModel> list = new ArrayList<>();

        defaultDb(new JdbcStrategy() {
            @Override
            public PreparedStatement makePreparedStatement(Connection con) throws SQLException {
                StringBuilder sql = new StringBuilder();
                sql.append("SELECT ");
                sql.append("sequence, ");
                sql.append("title, ");
                sql.append("content, ");
                sql.append("writer ");
                sql.append("FROM bulletin ");
                sql.append("ORDER BY sequence DESC ");

                PreparedStatement pstmt = con.prepareStatement(sql.toString());
                ResultSet rs = pstmt.executeQuery();

                while (rs.next()) {
                    int sequence = rs.getInt("sequence");
                    String title = rs.getString("title");
                    String content = rs.getString("content");
                    String writer = rs.getString("writer");

                    BulletinModel listModel = new BulletinModel(sequence, title, content, writer);
                    list.add(listModel);
                }
                return pstmt;
            }
        });
        return list;
    }

    public BulletinModel getList(int sequence) throws Exception{
        final BulletinModel[] model = new BulletinModel[1];

        defaultDb(new JdbcStrategy() {
            @Override
            public PreparedStatement makePreparedStatement(Connection con) throws SQLException {
                StringBuilder sql = new StringBuilder();
                sql.append("SELECT ");
                sql.append("sequence, ");
                sql.append("title, ");
                sql.append("content, ");
                sql.append("writer ");
                sql.append("FROM bulletin ");
                sql.append("WHERE sequence LIKE ?");

                PreparedStatement pstmt = con.prepareStatement(sql.toString());
                pstmt.setString(1, String.valueOf(sequence));

                ResultSet rs = pstmt.executeQuery();
                rs.next();

                model[0] = new BulletinModel(rs.getInt("sequence"), rs.getString("title"),
                                      rs.getString("content"), rs.getString("writer"));
                return pstmt;
            }
        });
        return model[0];
    }

    public void writeList(BulletinModel model) throws Exception{
        defaultDb(new JdbcStrategy() {
            @Override
            public PreparedStatement makePreparedStatement(Connection con) throws SQLException {
                StringBuilder sql = new StringBuilder();
                sql.append("INSERT INTO bulletin ");
                sql.append("(sequence, title, content, writer) ");
                sql.append("VALUES (?, ?, ?, ?) ");

                PreparedStatement pstmt = con.prepareStatement(sql.toString());
                pstmt.setInt(1, model.sequence);
                pstmt.setString(2, model.title);
                pstmt.setString(3, model.content);
                pstmt.setString(4, model.writer);

                return pstmt;
            }
        });
    }

    public void updateList(BulletinModel model) throws Exception{
        defaultDb(new JdbcStrategy() {
            @Override
            public PreparedStatement makePreparedStatement(Connection con) throws SQLException {
                StringBuilder sql = new StringBuilder();
                sql.append("UPDATE bulletin SET ");
                sql.append("title = ?, ");
                sql.append("content = ? ");
                sql.append("WHERE sequence = ? ");

                PreparedStatement pstmt = con.prepareStatement(sql.toString());
                pstmt.setString(1, model.title);
                pstmt.setString(2, model.content);
                pstmt.setInt(3, model.sequence);

                return pstmt;
            }
        });
    }

    public int getSequence() throws Exception{
        int[] sequence = new int[1];

        defaultDb(new JdbcStrategy() {
            @Override
            public PreparedStatement makePreparedStatement(Connection con) throws SQLException {
                StringBuilder sql = new StringBuilder();
                sql.append("SELECT ");
                sql.append("sequence ");
                sql.append("FROM bulletin ");
                sql.append("ORDER BY sequence DESC ");

                PreparedStatement pstmt = con.prepareStatement(sql.toString());
                ResultSet rs = pstmt.executeQuery();
                rs.next();

                try{
                    sequence[0] = rs.getInt("sequence");
                }catch (Exception e){
                    sequence[0] = 0;
                }

                return pstmt;
            }
        });
        return sequence[0];
    }
}
