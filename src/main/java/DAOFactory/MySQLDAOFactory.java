package DAOFactory;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDAOFactory extends DAOFactory{

    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DBURL = "jdbc:mysql://localhost:3306/practicodb";

    public static Connection createConnection() {
        try {
            Class.forName(DRIVER).getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection conn = DriverManager.getConnection(DBURL, "root", "1234");
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
