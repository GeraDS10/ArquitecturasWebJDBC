package DAOFactory;

import DerbyDAO.DerbyClienteDAO;
import DerbyDAO.DerbyFacturaDAO;
import DerbyDAO.DerbyFacturaProductoDAO;
import DerbyDAO.DerbyProductoDAO;
import ModelosDAO.ClienteDAO;
import ModelosDAO.FacturaDAO;
import ModelosDAO.FacturaProductoDAO;
import ModelosDAO.ProductoDAO;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DerbyDAOFactory extends DAOFactory{

    private Connection conn = null;
    @Override
    public Connection createConnection() {
        if(conn == null){
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
        else {
            return conn;
        }
    }

    @Override
    public ClienteDAO getClienteDAO() {
        return new DerbyClienteDAO(createConnection());
    }

    @Override
    public FacturaDAO getFacturaDAO() {

        return new DerbyFacturaDAO(createConnection());
    }

    @Override
    public ProductoDAO getProductoDAO() {

        return new DerbyProductoDAO(createConnection());
    }

    @Override
    public FacturaProductoDAO getFacturaProductoDAO() {

        return new DerbyFacturaProductoDAO(createConnection());
    }
}
