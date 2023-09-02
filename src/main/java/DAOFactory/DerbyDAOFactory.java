package DAOFactory;

import ModelosDAO.ClienteDAO;
import ModelosDAO.FacturaDAO;
import ModelosDAO.FacturaProductoDAO;
import ModelosDAO.ProductoDAO;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DerbyDAOFactory extends DAOFactory{
    @Override
    public Connection createConnection() {
        Connection conn = null;
        String driver = "org.apache.derby.jdbc.EmbeddedDriver";
        String uri = "jdbc:derby:MyDerbyDB;create=true";
        try {
            Class.forName(driver).getDeclaredConstructor().newInstance();
            conn = DriverManager.getConnection(uri);
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException |
                 InvocationTargetException | SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }

    @Override
    public ClienteDAO getClienteDAO() {
        return null;
    }

    @Override
    public FacturaDAO getFacturaDAO() {
        return null;
    }

    @Override
    public ProductoDAO getProductoDAO() {
        return null;
    }

    @Override
    public FacturaProductoDAO getFacturaProductoDAO() {
        return null;
    }
}
