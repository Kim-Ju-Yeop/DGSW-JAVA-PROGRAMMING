package example.class06_18;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface JdbcStrategy {
    PreparedStatement makePreparedStatement(Connection con) throws SQLException;
}
