package configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aodi
 */
public class Koneksi {

    private final String JDBC_URL = "jdbc:mysql://localhost:3306/fitsport";
    private final String USERNAME = "root";
    private final String PASSWORD = "";

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
