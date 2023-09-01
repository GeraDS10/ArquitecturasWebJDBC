package DAOFactory;

import ModelosDAO.ClienteDAO;
import ModelosDAO.FacturaDAO;
import ModelosDAO.FacturaProductoDAO;
import ModelosDAO.ProductoDAO;

import java.sql.Connection;

public abstract class DAOFactory {

    public static DAOFactory createFactory(int type) {
        switch (type) {
            case 1:
                return new MySQLDAOFactory();
            case 2:
                return new DerbyDAOFactory();
        }
        return null;
    }

    public abstract Connection createConnection();

    public abstract ClienteDAO getClienteDAO();
    public abstract FacturaDAO getFacturaDAO();
    public abstract ProductoDAO getProductoDAO();
    public abstract FacturaProductoDAO getFacturaProductoDAO();
}
