package DAOFactory;

import ModelosDAO.ClienteDAO;
import ModelosDAO.FacturaDAO;
import ModelosDAO.FacturaProductoDAO;
import ModelosDAO.ProductoDAO;

import java.sql.Connection;

public class DerbyDAOFactory extends DAOFactory{
    @Override
    public Connection createConnection() {
        return null;
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
