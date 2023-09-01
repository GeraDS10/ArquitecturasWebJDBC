package DAOFactory;

import ModelosDAO.ClienteDAO;
import ModelosDAO.FacturaDAO;
import ModelosDAO.FacturaProductoDAO;
import ModelosDAO.ProductoDAO;
import MySQLDAO.MySQLClienteDAO;
import MySQLDAO.MySQLFacturaDAO;
import MySQLDAO.MySQLFacturaProductoDAO;
import MySQLDAO.MySQLProductoDAO;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDAOFactory extends DAOFactory{

    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DBURL = "jdbc:mysql://localhost:3306/practicodb";
    private static Connection conn = null;

    public static Connection createConnection() {
        if (conn == null){
            try {
                Class.forName(DRIVER).getDeclaredConstructor().newInstance();
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            try {
                conn = DriverManager.getConnection(DBURL, "root", "1234");
                conn.setAutoCommit(false);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
       return conn;
    }

    @Override
    public ClienteDAO getClienteDAO(){
        return new MySQLClienteDAO();
    }

    @Override
    public FacturaDAO getFacturaDAO(){
        return new MySQLFacturaDAO();
    }

    @Override
    public FacturaProductoDAO getFacturaProductoDAO(){
        return new MySQLFacturaProductoDAO();
    }

    @Override
    public ProductoDAO getProductoDAO(){
        return new MySQLProductoDAO();
    }

}
